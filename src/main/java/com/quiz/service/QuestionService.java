package com.quiz.service;

import com.quiz.model.Question;
import com.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionService implements IQuestionService{

    @Autowired
    private QuestionRepository repository;

    @Override
    public List<Question> findAll() {

        List<Question> questions = (List<Question>) repository.findAll();

        return questions;
    }
}
