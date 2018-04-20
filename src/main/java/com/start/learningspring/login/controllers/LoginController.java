package com.start.learningspring.login.controllers;


import com.start.learningspring.login.models.User;
import com.start.learningspring.login.rxro.LoginRequest;
import com.start.learningspring.login.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

    @RestController
    public class LoginController {

        private final UserService userService;

        @Autowired
        public LoginController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping("userslogin")
        User login(@RequestParam(value = "username") String username,@RequestParam("password") String password) {
            return userService.login(username,password);
        }

    }

