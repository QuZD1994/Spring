package com.spring.dao;

import com.spring.entity.Users;

public interface UsersDao {

    Users getUserByNamePWD(String name, String pwd);
}
