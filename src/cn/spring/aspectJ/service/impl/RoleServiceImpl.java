package cn.spring.aspectJ.service.impl;

import cn.spring.aspectJ.entity.Role;
import cn.spring.aspectJ.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("{id :" + role.getId() + ", " +
        "role_name : " + role.getName() + ", " + "note : " + role.getNote() + "}");
    }
}
