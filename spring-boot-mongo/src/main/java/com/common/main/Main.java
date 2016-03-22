package com.common.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableMongoRepositories("com.common.repository")
@ComponentScan({"com.common.main", "com.common.service"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
