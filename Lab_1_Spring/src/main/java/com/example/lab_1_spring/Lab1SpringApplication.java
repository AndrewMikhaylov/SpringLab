package com.example.lab_1_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@Order(2)
@SpringBootApplication
public class Lab1SpringApplication implements CommandLineRunner {

    public static void main(String[] args) {

        System.out.println("Begin of main");
        SpringApplication.run(Lab1SpringApplication.class, args);
        System.out.println("End of main");

    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from spring boot");
    }
}
