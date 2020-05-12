package com.example.user.dao;

import com.example.user.model.Role;
import com.example.user.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User findByUsername(String username);

    Role selectRolesByUserId(Integer id);
}
