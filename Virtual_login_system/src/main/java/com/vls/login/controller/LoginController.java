package com.vls.login.controller;

import com.vls.login.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/** Endpoints for login/authentication. */
@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final LoginService loginService;
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }



    /** POST /api/login?username=...&password=... */
    @PostMapping
    public ResponseEntity<String> login(@RequestParam String username,
                                        @RequestParam String password) {
        String message = loginService.authenticate(username, password);
        return ResponseEntity.ok(message);
    }
}
