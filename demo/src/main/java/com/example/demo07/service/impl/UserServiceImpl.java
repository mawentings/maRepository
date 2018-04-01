package com.example.demo07.service.impl;

import com.example.demo07.dao.UserMapper;
import com.example.demo07.models.User;
import com.example.demo07.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    //查询所有该数据
    @Override
    public List<User> getAllUser() {
        List<User> uss=userMapper.getAllUser();
        return uss;
    }

    @Override
    public List<User> getUserByPage(User user) {
        return userMapper.getUserByPage(user);
    }
}
