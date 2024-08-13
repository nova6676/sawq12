package com.example.FirstSecirite.repository;

import com.example.FirstSecirite.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositiry extends JpaRepository<User, Long> {
    User findByUsername(String username);
}