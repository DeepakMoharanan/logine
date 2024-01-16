package com.login.repository;

import com.login.entity.Login;
import com.login.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface LoginRepository extends JpaRepository<Registration,Long> {
    Optional<Registration> findByUsername(String username);

}
