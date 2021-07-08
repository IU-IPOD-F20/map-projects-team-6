package com.quiz.service;

import com.quiz.model.Quiz;
import com.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService implements IQuizService{

    @Autowired
    private QuizRepository repository;

    @Override
    public List<Quiz> findAll() {

        List<Quiz> quizzes = (List<Quiz>) repository.findAll();

        return quizzes;
    }
}
