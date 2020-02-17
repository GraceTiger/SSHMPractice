package com.zxc.config;

import com.zxc.model.Account;
import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.zxc"})
@Import({JdbcConfig.class})
//开启基于注解的事务管理
@EnableTransactionManagement
public class RootConfig {

    //注入实体类
    @Bean("account")
    public Account createAccount(){
        return new Account();
    }

}
