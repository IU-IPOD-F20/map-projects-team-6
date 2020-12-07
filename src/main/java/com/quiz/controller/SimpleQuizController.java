package com.quiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleQuizController {

    @RequestMapping("/showQuiz")
    public String hello() {
        return "showQuiz";
    }

}
