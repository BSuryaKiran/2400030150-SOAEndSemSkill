package com.example.jwt_demo.repository;

import org.springframework.stereotype.Repository;
import com.example.jwt_demo.entity.User;

@Repository
public class UserRepository {

    public User getUser() {
        return new User("kiran", "STUDENT");
    }
}
