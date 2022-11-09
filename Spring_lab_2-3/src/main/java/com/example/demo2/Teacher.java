package com.example.demo2;

public class Teacher {
    int id;
    String name;
    String surname;
    String lessonName;
    int teachCod;

    public Teacher(int id, String name, String surname, String lessonName, int teachCod) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lessonName = lessonName;
        this.teachCod = teachCod;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLessonName() {
        return lessonName;
    }

    public int getTeachCod() {
        return teachCod;
    }
}
