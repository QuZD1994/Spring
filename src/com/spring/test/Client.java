package com.spring.test;

import com.spring.entity.Users;
import com.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.longinUser(null,null);
        Users users = (Users) applicationContext.getBean("user");
        System.out.println("用户：" + users.getName() + "拥有：" + users.getProduct().getPname());
    }
}
