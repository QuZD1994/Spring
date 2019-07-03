package cn.spring.aspectJ.test;

import cn.spring.aspectJ.config.Aopconfig;
import cn.spring.aspectJ.entity.Role;
import cn.spring.aspectJ.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Aopconfig.class);
        RoleService roleService = ctx.getBean(RoleService.class);
        Role role = new Role();
        role.setId(1l);
        role.setName("role_name_1");
        role.setNote("note_1");
        roleService.printRole(role);
    }
}
