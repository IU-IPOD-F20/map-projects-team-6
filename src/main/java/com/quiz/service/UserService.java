package com.quiz.service;

import com.quiz.model.User;
import java.util.List;

import com.quiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {

        List<User> users = (List<User>) repository.findAll();

        return users;
    }

    @Override
    public User findById(Long id) {

        User user = repository.findById(id).orElse(new User());

        return user;
    }
}
