package com.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleQuizController {

    @GetMapping("/showQuiz")
    public String showQuiz() {
        return "showQuiz";
    }

}
