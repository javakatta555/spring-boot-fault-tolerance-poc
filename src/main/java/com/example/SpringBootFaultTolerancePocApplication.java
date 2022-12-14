package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class SpringBootFaultTolerancePocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFaultTolerancePocApplication.class, args);
	}

}
