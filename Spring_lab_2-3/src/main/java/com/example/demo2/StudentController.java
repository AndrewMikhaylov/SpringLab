package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    int isTeach;
    @Autowired
    StudentService userService ;

    @GetMapping("/")
    String userInfo(Model model) {
        model.addAttribute("lessson", userService.getLesson());
        return "Edit";
    }

    @GetMapping("/edit")
    String edit(boolean a, int b, int id, Model model) {
        userService.addPM(id, a, b);
        model.addAttribute("isT", isTeach);
        model.addAttribute("lessson", userService.getLesson());
        return "userInfo";
    }

    @GetMapping("/eee")
    String eee(int id, Model model) {
        model.addAttribute("lessson", userService.getLesson().get(id));
        return "eqwe";
    }

    @GetMapping("/isTeacher")
    String isTeacher(int S, Model model) {
        isTeach = S;
    model.addAttribute("lessson", userService.getLesson());
        model.addAttribute("isT", isTeach);
        return "userInfo";
    }
}
