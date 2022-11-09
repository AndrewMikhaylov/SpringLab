package com.example.demo2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService implements StudentServsce {
    StudentDB s = new StudentDB();

    @Override
    public List<Lessson> getLesson() {
        while (s.lesssonList.size() == 0) {
            s.dddd();
        }


        return s.lesssonList;
    }

    @Override
    public void addPM(int id, boolean present, int mark) {

        s.lesssonList.get(id).setPresent(present);
        s.lesssonList.get(id).setMark(mark);


    }

    public int teachCode(int S) {
        int i =0;

        while (i<=s.teacherList.size()) {
            if (S == s.teacherList.get(i).getTeachCod()) {
                return s.lesssonList.get(i).getId();


            }
            i++;

        }
        return S;
    }

}
