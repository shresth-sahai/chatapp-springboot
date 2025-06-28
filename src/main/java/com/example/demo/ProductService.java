package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public void addProduct(Product product){
        repository.save(product);
    }
    public List<Product> getAllProducts(){
        return repository.findAll();
    }
    public List<Product> getByCategory(String Category){
        return  repository.findByCategory(category);
    }
}
