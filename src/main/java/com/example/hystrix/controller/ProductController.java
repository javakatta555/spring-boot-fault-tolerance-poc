package com.example.hystrix.controller;

import com.example.hystrix.model.Rating;
import com.example.hystrix.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/product")
    public Rating getProduct(){
    return productService.getProduct();
    }
}
