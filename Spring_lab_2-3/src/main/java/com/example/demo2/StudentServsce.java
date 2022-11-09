package com.example.demo2;

import java.util.List;

public interface StudentServsce {
    public List<Lessson> getLesson();
    public void addPM(int id, boolean present, int mark);
}
