package com.vls.login.repo;

import com.vls.login.model.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/** JPA repository for LoginModel */
public interface LoginRepository extends JpaRepository<LoginModel, Integer> {
    Optional<LoginModel> findByUsername(String username);
}
