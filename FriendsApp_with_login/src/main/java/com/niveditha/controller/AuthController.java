package com.niveditha.controller;

import org.springframework.web.bind.annotation.*;
import com.niveditha.entity.User;
import com.niveditha.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    public AuthController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User existing = userService.findByUsername(user.getUsername());
        if (existing != null) {
            return "Login successful";
        }
        return "Invalid username or password";
    }
}
