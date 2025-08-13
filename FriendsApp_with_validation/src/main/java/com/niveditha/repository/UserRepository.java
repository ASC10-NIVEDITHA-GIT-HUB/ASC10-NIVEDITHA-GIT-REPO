package com.niveditha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.niveditha.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}

