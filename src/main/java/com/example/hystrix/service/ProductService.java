package com.example.hystrix.service;

import com.example.hystrix.model.Rating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ProductService {

    @HystrixCommand(fallbackMethod = "getProductFallback")
    public Rating getProduct(){
        log.info("Inside product service");
        return new RestTemplate().getForObject("http://localhost:8081/rating", Rating.class);
    }

    public Rating getProductFallback(){
        log.info("inside handle downtime");
        return null;
    }

}
