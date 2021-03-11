package com.AdSpy.service.impl;

import com.AdSpy.dao.UserDao;
import com.AdSpy.entity.User;
import com.AdSpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUsersByUsername(String username){
        System.out.println("业务层：通过姓名查询用户");
        return userDao.getUsersByUsername(username);
    }

    @Override
    public List<User> findAll(){
        System.out.println("业务层：查询所有账户");
        return userDao.findAll();
    }
    @Override
    public void saveUser(User user){
        System.out.print("业务层：保存用户");
        userDao.saveUser(user);
    }
}
