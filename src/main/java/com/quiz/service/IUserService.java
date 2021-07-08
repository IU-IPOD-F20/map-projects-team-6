package com.quiz.service;

import com.quiz.model.User;
import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(Long id);
}
