package com.quiz.service;

import com.quiz.model.Quiz;
import com.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuizService implements IQuizService{

    @Autowired
    private QuizRepository repository;

    @Override
    public List<Quiz> findAll() {

        List<Quiz> quizes = (List<Quiz>) repository.findAll();

        return quizes;
    }
}
