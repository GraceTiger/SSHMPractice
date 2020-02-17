package com.zxc.config;

import com.mchange.v2.c3p0.DriverManagerDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(value="com.zxc.dao")
@PropertySource({"classpath:Jdbc.properties"})
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driverClass;

    @Value("${jdbc.username}")
    private String user;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Bean("dataSource")
    public DataSource createDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClass(driverClass);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl(jdbcUrl);
        return dataSource;
    }

    //注册事务管理器
    @Bean("transactionManager")
    public DataSourceTransactionManager createTransactionManager() {
        return new DataSourceTransactionManager(createDataSource());
    }

    @Bean("sessionFactory")
    public SqlSessionFactory createSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(createDataSource());
        return sessionFactory.getObject();
    }
}