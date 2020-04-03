package com.zxc.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//Spring不扫描Controller
@ComponentScan(value = "com.zxc",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
})
@Import({JdbcConfig.class})
//开启基于注解的事务管理
@EnableTransactionManagement
//开启AspectJ切面扫描
@EnableAspectJAutoProxy
public class RootConfig {

}
