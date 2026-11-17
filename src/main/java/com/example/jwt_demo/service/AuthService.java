package com.example.jwt_demo.service;


import java.util.Date;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import com.example.jwt_demo.entity.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class AuthService {

    private final String secret =
        "MDEyMzQ1Njc4OWFiY2RlZjAxMjM0NTY3ODlhYmNkZWY=";

    public String generate(User user) {
        SecretKey key = Keys.hmacShaKeyFor(
            Decoders.BASE64.decode(secret));

        return Jwts.builder()
            .subject(user.username)
            .claim("role", user.role)
            .issuedAt(new Date())
            .expiration(new Date(
                System.currentTimeMillis() + 3600000))
            .signWith(key)
            .compact();
    }
}