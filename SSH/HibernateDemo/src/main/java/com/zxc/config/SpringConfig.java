package com.zxc.config;

import com.zxc.model.Department;
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

    @Bean(name = "department")
    public Department createDepartment(){
        return new Department();
    }
}
