package com.zxc.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
public class JdbcConfig {

    //注册事务管理器
    @Bean("transactionManager")
    public HibernateTransactionManager createTransactionManager(@Autowired SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }


    @Bean("dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/saperp?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setInitialPoolSize(3);
        dataSource.setMaxPoolSize(10);
        dataSource.setMinPoolSize(3);
        dataSource.setAcquireIncrement(3);
        return dataSource;
    }

    //注册SessionFactory
    @Bean("sessionFactory")
    //单例模式
    @Scope("singleton")
    public LocalSessionFactoryBean createSessionFactory(@Autowired ComboPooledDataSource dataSource) throws Exception {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setPackagesToScan("com.zxc.model");
        return sessionFactory;
    }

}