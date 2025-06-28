package com.example.demo;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class ChatController {

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public ChatMessage send(@DestinationVariable String room, ChatMessage message) {
        System.out.println(" Message received: " + message.getSender() + " - " + message.getContent());
        message.setTimestamp(LocalDateTime.now().toString());
        return message;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}