package com.example.demo2;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    List<Student> userList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();
    List<Lessson> lesssonList = new ArrayList<>();


    public void dddd() {


        userList.add(new Student(0, "Huz", "Bohdan", "IA-02"));
        userList.add(new Student(1, "Molodec", "Bohdan", "w3"));
        userList.add(new Student(2, "Mikhaylow", "Andrey", "r3"));

        teacherList.add(new Teacher(0, "TeacherNumber", "One", "Spring",723));
        teacherList.add(new Teacher(1, "Teacher", "NumberTwo", "Java",456));
        teacherList.add(new Teacher(2, "Teacher", "NumberTwo", "Java",789));

        lesssonList.add(new Lessson(0, teacherList.get(0), userList.get(0)));
        lesssonList.add(new Lessson(1, teacherList.get(1), userList.get(1)));
        lesssonList.add(new Lessson(2, teacherList.get(0), userList.get(2)));
        lesssonList.add(new Lessson(2, teacherList.get(2), userList.get(1)));


    }


}
