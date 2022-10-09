package com.example.lab2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Bean
    @Scope("prototype")
    public Student getStudent(){
        Student student = new Student("Andrew Mikhaylov");
        return student;
    }
}
