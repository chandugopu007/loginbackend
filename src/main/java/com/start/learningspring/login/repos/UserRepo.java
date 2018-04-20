package com.start.learningspring.login.repos;

import com.start.learningspring.login.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepo extends JpaRepository<User, String> {

    User findOneByUsername(String username);
}
