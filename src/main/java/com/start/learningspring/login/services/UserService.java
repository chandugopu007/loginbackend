package com.start.learningspring.login.services;

import com.start.learningspring.login.models.User;
import com.start.learningspring.login.repos.UserRepo;
import com.start.learningspring.login.rxro.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User login(String username, String password)
    {
        User user;
        user = userRepo.findOneByUsername(username);
        if(user.getPassword().equals(password))
        {
            return user;
        }
        else{
            return null;
        }
    }
}
