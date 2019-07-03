package com.spring.dao;

import com.spring.entity.Users;

public class UserDaoImpl implements UsersDao {
    @Override
    public Users getUserByNamePWD(String name, String pwd) {
        System.out.println("获取用户信息");
        return new Users();
    }
}
