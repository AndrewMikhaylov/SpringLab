package com.example.lab44444444;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
public class LessonController {

    LessonRepository lessonRepo;

    public LessonController(LessonRepository lessonRepo) {
        this.lessonRepo = lessonRepo;
    }

    @GetMapping("/students")
    Collection<Lesson> findAll() {
        return lessonRepo.findAll();
    }

    @GetMapping("/student/{id}")
    ResponseEntity<Map<Student, List<Integer>>> findById(@PathVariable Integer id) {

        if (lessonRepo.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        Map<Student, List<Integer>> student = lessonRepo.findById(id);
        return ResponseEntity.ok(student);

    }

    @DeleteMapping("/delete/{id1},{id2},{id3}")
    ResponseEntity<?> deleteById(@PathVariable Integer id1, @PathVariable Integer id2, @PathVariable Integer id3) {
        if (lessonRepo.deleteByID(id1, id2, id3)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PutMapping("/put/{id},{id1},{id2},{id3}")
    ResponseEntity<?> save(@PathVariable Integer id, @PathVariable Integer id1,
                           @PathVariable Integer id2, @PathVariable Integer id3) {
        if (lessonRepo.save(id, id1, id2, id3) == null) {
            return ResponseEntity.notFound().build();
        }
        lessonRepo.save(id, id1, id2, id3);
        return ResponseEntity.noContent().build();
    }

}

