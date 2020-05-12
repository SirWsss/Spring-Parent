package com.example.user.service.impl;

import com.example.user.dao.UserDao;
import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Author UserServiceImpl
 * @Date 2020/5/10 0010 15:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String username) {
        return userDao.findByUsername(username);
    }
}
