package com.example.flower.dao;

import com.example.flower.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername (String username);
}
