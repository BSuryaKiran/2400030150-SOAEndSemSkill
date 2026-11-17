package com.example.jwt_demo.entity;

public class User {
    public String username;
    public String role;

    public User() {}

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }
}