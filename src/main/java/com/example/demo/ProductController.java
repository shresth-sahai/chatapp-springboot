package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public String home(){
        return  "home";
    }
    public String showAddForm(Model model){
        model.addAttribute("product",new Product());
        return "add-product";
    }
}