package com.m01project.taskmanager.demo.service;

import com.m01project.taskmanager.demo.entity.User;

import java.util.List;

public interface UserService {
    // Create/Update
    User save(User user);

    // Read All
    List<User> findAll();

    // Read by ID
    User findById(Long id);

    // Delete
    void deleteById(Long id);
}
