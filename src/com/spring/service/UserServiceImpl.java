package com.spring.service;

import com.spring.dao.UserDaoImpl;
import com.spring.dao.UsersDao;
import com.spring.entity.Users;

public class UserServiceImpl implements UserService{


    /**
     * 通过Spring 降低依赖关系
     */
    private UsersDao usersDao;

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public Users longinUser(String name, String pwd) {
        return usersDao.getUserByNamePWD(name, pwd);
    }
}
