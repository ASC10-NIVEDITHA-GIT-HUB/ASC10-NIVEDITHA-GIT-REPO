package com.niveditha.service;

import com.niveditha.entity.User;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
}

