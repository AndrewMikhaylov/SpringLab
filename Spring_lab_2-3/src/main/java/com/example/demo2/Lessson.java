package com.example.demo2;

public class Lessson {
    int id;
    Teacher teacherList;
    Student student;

    boolean present;
    int mark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lessson(int id, Teacher teacherList, Student student) {
        this.id = id;
        this.teacherList = teacherList;
        this.student = student;


    }

    public Teacher getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Teacher teacherList) {
        this.teacherList = teacherList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
