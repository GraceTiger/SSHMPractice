package com.zxc.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class JdbcConfig {

    //注册事务管理器
    @Bean("transactionManager")
    public HibernateTransactionManager createTransactionManager(@Autowired SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }

    //注册SessionFactory
    @Bean("sessionFactory")
    public LocalSessionFactoryBean createSessionFactory() throws Exception {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setPackagesToScan("com.zxc.model");
        return sessionFactory;
    }

    @Bean("hibernateTemplate")
    public HibernateTemplate createHibernateTemplate(SessionFactory sessionFactory){
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        hibernateTemplate.setSessionFactory(sessionFactory);
        return hibernateTemplate;
    }

}