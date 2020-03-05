package com.zxc.config;

import com.zxc.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.zxc"})
@Import({JdbcConfig.class})
@EnableTransactionManagement
public class SpringConfig {

    @Bean(name = "employee")
    public Employee createEmployee(){
        return new Employee();
    }
}
