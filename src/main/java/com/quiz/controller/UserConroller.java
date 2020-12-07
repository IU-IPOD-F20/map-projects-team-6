package com.quiz.controller;

import com.quiz.model.User;
import com.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class UserConroller {

    @Autowired
    private UserService userService;

    @GetMapping("/showUsers")
    public String findCities(Model model) {

        var users = userService.findAll();

        model.addAttribute("users", users);

        return "showUsers";
    }
}
