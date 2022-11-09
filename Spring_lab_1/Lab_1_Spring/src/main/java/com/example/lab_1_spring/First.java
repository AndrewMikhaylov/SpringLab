package com.example.lab_1_spring;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
public class First implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("First");
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("First");
//
//    }
}
