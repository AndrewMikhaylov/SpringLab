package com.example.lab44444444;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InMemoryLesson {
    TreeMap<Integer, Student> students;
    TreeMap<Integer, Lesson> lessons;
    Map<Student, List<Integer>> studentesJava;
    Map<Student, List<Integer>> studentesSpring;
    List<Integer> marks;


    public InMemoryLesson() {
        students = new TreeMap<>();
        studentesJava = new HashMap<>();
        studentesSpring = new HashMap<>();
        lessons = new TreeMap<Integer, Lesson>();
        marks = new ArrayList<>();
        students.put(1, new Student(1, "Huz", "Bohdan", "IA-02"));
        students.put(2, new Student(2, "Molodech", "Bohdan", "IA-03"));
        students.put(3, new Student(3, "ddddddddd", "asssssssss", "Id-02"));
        ///////////////////////////////////////////////////////////////////////////
        marks.add(11);
        marks.add(12);
        marks.add(11);
        studentesJava.put(students.get(1), marks);
        studentesJava.put(students.get(2), new ArrayList<>());
        studentesJava.put(students.get(3), new ArrayList<>());

        lessons.put(1, new Lesson(1, "java", studentesJava));
        lessons.put(2, new Lesson(2, "spring", studentesJava));


    }


}


