package com.AdSpy.dao;

import com.AdSpy.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface UserDao {

    //@Select("select * from users")
    public List<User> findAll();

    public User getUsersByUsername(String username);

    public void saveUser(User user);
    
    public void updateUser(User user);

    public void deleteUser(int id);

    public User findById(int id);

    public int findTotal();
}
