package com.example.lab44444444;

import java.util.List;
import java.util.Map;

public class Leson {
    private int id;
    private String name;
    private Map<Student,List<Integer>> studList;

    public Leson(int id, String name, Map<Student, List<Integer>> studList) {
        this.id = id;
        this.name = name;
        this.studList = studList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Student, List<Integer>> getStudList() {
        return studList;
    }

    public void setStudList(Map<Student, List<Integer>> studList) {
        this.studList = studList;
    }

    @Override
    public String toString() {
        return "Leson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studList=" + studList +
                '}';
    }
}
