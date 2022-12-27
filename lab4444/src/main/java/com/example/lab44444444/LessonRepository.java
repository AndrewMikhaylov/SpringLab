package com.example.lab44444444;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface LessonRepository {
    Map<Student, List<Integer>> findById(Integer id);
    Collection<Lesson> findAll();
    boolean deleteByID(Integer idLesson,Integer idStudent,Integer idMark);
    Lesson save(Integer idLesson,Integer idStudent,Integer idMark,Integer mark);
}
