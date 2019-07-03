package cn.spring.app;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    public void query(){
        System.out.println("query db");
    }
}
