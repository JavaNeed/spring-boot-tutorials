package com.websystique.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})
public class SpringBootRestApiApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApp.class, args);
	}
}
