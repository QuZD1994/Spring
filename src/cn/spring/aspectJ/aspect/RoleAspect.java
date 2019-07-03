package cn.spring.aspectJ.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
public class RoleAspect {
    @Before("execution(void cn.spring.aspectJ.service.impl.RoleServiceImpl.printRole(..))")
    public void before(){
        System.out.println("before ....");
    }
    @After("execution(void cn.spring.aspectJ.service.impl.RoleServiceImpl.printRole(..))")
    public void after(){
        System.out.println("after ....");
    }
    @AfterReturning("execution(void cn.spring.aspectJ.service.impl.RoleServiceImpl.printRole(..))")
    public void afterReturning(){
        System.out.println("afterReturning ....");
    }
    @AfterThrowing("execution(void cn.spring.aspectJ.service.impl.RoleServiceImpl.printRole(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing ....");
    }
}
