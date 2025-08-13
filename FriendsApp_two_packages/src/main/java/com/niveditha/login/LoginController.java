package com.niveditha.login;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping
    public String login(@RequestParam String username, @RequestParam String password) {
        return service.login(username, password) ? "Login Successful" : "Invalid Credentials";
    }
}
