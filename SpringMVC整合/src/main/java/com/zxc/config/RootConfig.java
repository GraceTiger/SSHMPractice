package com.zxc.config;

import com.zxc.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Configuration
//Spring不扫描Controller
@ComponentScan(value = "com.zxc",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
})
@Import(value = JdbcConfig.class)
//开启基于注解的事务管理
@EnableTransactionManagement
public class RootConfig {

    //注入实体类
    @Bean("account")
    public Account createAccount(){
        return new Account();
    }



}
