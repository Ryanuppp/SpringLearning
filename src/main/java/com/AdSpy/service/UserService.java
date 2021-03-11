package com.AdSpy.service;

import com.AdSpy.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User getUsersByUsername(String username);

    public void saveUser(User user);
}
