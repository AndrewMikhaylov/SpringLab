package com.example.lab44444444;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class LessonService implements LessonRepository {
@Autowired
InMemoryLesson lessonMEM;
    @Override
    public Map<Student, List<Integer>> findById(Integer id) {
        if (id > lessonMEM.lessons.lastKey()) {
            return null;
        } else {
            System.out.println(lessonMEM.lessons.get(1).getStudList().keySet());
            return lessonMEM.lessons.get(id).getStudList();
        }
    }

    @Override
    public Collection<Lesson> findAll() {
        return lessonMEM.lessons.values();
    }

    @Override
    public boolean deleteByID(Integer idLesson, Integer idStudent, Integer idMark) {
        if (idLesson > lessonMEM.lessons.size() || idStudent > lessonMEM.lessons.get(idLesson).getStudList().size() ||
                idMark > lessonMEM.lessons.get(idLesson).getStudList().get(lessonMEM.students.get(idStudent)).size()) {
            return false;
        } else {
            return lessonMEM.lessons.get(idLesson).getStudList().get(lessonMEM.students.get(idStudent)).remove((int) idMark - 1) != null;
        }
    }

    @Override
    public Lesson save(Integer idLesson, Integer idStudent, Integer idMark, Integer mark) {
        if (idLesson > lessonMEM.lessons.size() || idStudent > lessonMEM.lessons.get(idLesson).getStudList().size() ||
                idMark > lessonMEM.lessons.get(idLesson).getStudList().get(lessonMEM.students.get(idStudent)).size()) {
            return null;
        } else {
            if (idMark == 0) {
                int len = lessonMEM.lessons.get(idLesson).getStudList().get(lessonMEM.students.get(idStudent)).size();
                lessonMEM.lessons.get(idLesson).getStudList().get(lessonMEM.students.get(idStudent)).add(len, mark);
            } else {
                lessonMEM.lessons.get(idLesson).getStudList().get(lessonMEM.students.get(idStudent)).set(idMark - 1, mark);
            }
        }
        return lessonMEM.lessons.get(idLesson);
//

    }

}
