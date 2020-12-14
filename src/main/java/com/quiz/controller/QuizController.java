package com.quiz.controller;

import com.quiz.service.QuestionService;
import com.quiz.service.QuizService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {

    @Autowired
    QuizService quizService;

    @Autowired
    QuestionService questionService;

    @GetMapping("/showQuizzes")
    public String findQuizes(Model model) {

        var quizzes = quizService.findAll();
        var questions = questionService.findAll();

        model.addAttribute("quizzes", quizzes);
        model.addAttribute("questions", questions);

        return "showQuizzes";
    }


}
