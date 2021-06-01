package com.example.desafioSpring.desafioSpring.controllers;

import com.example.desafioSpring.desafioSpring.models.User;
import com.example.desafioSpring.desafioSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> users(){
        return userRepository.findAll();
    }
}
