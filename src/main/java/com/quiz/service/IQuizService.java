package com.quiz.service;

import com.quiz.model.Quiz;
import java.util.List;

public interface IQuizService {
    List<Quiz> findAll();
}
