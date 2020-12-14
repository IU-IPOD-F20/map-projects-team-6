package com.quiz.service;

import com.quiz.model.Question;
import java.util.List;

public interface IQuestionService {
    List<Question> findAll();
}
