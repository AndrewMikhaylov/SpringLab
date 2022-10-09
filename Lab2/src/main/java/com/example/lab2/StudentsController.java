package com.example.lab2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentsController {


    ApplicationContext context = new AnnotationConfigApplicationContext(StudentService.class);
    Student student = context.getBean("getStudent", Student.class);

    @GetMapping("/")
    public String Start(@RequestParam(defaultValue = "False", required = false) boolean present,
                        @RequestParam(defaultValue = "", required = false) List<Integer> grades){
        student.grades = grades;
        student.present = present;
        return "begin";
    }
    @GetMapping("/Student")
    public String Student(Model model)
    {
        model.addAttribute("student", student);

        return "student";
    }
    @GetMapping("/Teacher")
    public String Teacher(Model model){
        model.addAttribute("name", student.name);
        return "teacher";
    }
}
