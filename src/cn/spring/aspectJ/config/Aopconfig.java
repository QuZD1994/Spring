package cn.spring.aspectJ.config;

import cn.spring.aspectJ.aspect.RoleAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("cn.spring.aspectJ")
public class Aopconfig {

    @Bean
    public RoleAspect getRoleAspect(){
        return new RoleAspect();
    }
}
