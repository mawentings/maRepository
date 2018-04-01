package com.example.demo07.service;

import com.example.demo07.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
     List<User> getUserByPage(User user);
}
