package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class BookFoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookFoodApplication.class, args);
    }

}
