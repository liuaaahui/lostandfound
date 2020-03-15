package com.example.service;

import com.example.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getAllUsers();
    List<Map<String, Object>> findAll();
    User getById(int id);
    int addUser(User user);
    int deleteUser(int id);
    int updateUser(User user);
    int isHasUserByusername(String username);
    List<User> isHasUser(User user);
    int updatebyID(String username);
}
