package cn.spring.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotVeryUsefulAspect {

    /**
     * 切点
     */
    @Pointcut("execution(* cn.spring.app..*.*(..))")
    private void anyOldTransfer() {
        System.out.println("切点");
    }
    //通知加到anyOldTransfer()之前
    @Before("anyOldTransfer()")
    public void advice(){
        System.out.println("................");
    }
}
