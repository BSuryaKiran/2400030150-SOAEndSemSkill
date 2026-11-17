package com.example.jwt_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.jwt_demo.entity.User;
import com.example.jwt_demo.service.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/token")
    public String generateToken(@RequestBody User user) {
        return service.generate(user);
    }
}