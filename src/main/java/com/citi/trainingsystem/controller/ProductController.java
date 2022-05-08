package com.citi.trainingsystem.controller;

import com.citi.trainingsystem.entity.Product;
import com.citi.trainingsystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository pdtRepository;

    @GetMapping("/name/{name}")
    public Product getProductByName(@PathVariable("name") String name){
        return pdtRepository.findByName(name);
    }
}
