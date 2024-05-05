package com.parcialII.parcial2.service;

import com.parcialII.parcial2.entities.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(Long id);
    public void createUser(User user);
    public void modifyUser(Long id,User user);
    public void deleteUser(Long id);
}
