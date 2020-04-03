package com.zxc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//业务层Advice
@Component
@Aspect
public class BusinessServiceAdvice {

    @Before(value = "execution(* com.zxc.service.impl.ProductServiceImpl.*(..))")
    public void runBefore(){
        System.out.println("BusinessServiceAdvice.runBefore......");
    }
}
