package com.zxc.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* com.zxc.service.impl.*.*(..))")
    public void pt1(){}

    @Before("pt1()")
    public void printLog(){
        System.out.println("Logger.printLog");
    }

    public void aroundPrintLog(){
        System.out.println("Logger.aroundPrintLog");
    }
}
