package com.vls.login.service;

import com.vls.exception.InvalidLoginException;
import com.vls.login.model.LoginModel;
import com.vls.login.repo.LoginRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/** Simple authentication against database (plain text for demo simplicity). */
@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    /** Validates credentials. Returns a message if success, throws otherwise. */
    public String authenticate(String username, String password) {
        Optional<LoginModel> opt = loginRepository.findByUsername(username);
        if (!opt.isPresent()) {
            throw new InvalidLoginException("Invalid username or password.");
        }
        LoginModel lm = opt.get();
        if (!lm.getPassword().equals(password)) {
            throw new InvalidLoginException("Invalid username or password.");
        }
        return "Login successful for user: " + username;
    }
}
