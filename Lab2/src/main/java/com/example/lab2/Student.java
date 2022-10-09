package com.example.lab2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Integer> grades;
    boolean present;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public boolean getPresent() {
        return present;
    }

    public List<Integer> getGrades() {
        return grades;
    }

}
