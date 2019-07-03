package cn.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * 1.@EnableAspectJAutoProxy:启用AspectJ支持
 */
@ComponentScan("cn.spring.app")
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
}
