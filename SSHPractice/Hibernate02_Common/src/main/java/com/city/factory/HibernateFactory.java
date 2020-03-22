package com.city.factory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateFactory {
	private static SessionFactory sf=null;
	//XML方式配置hibernate
	public static SessionFactory createSessionFactory() throws Exception{
		Configuration cfg=new Configuration();
		//从properties文件加载属性
		cfg.configure();
		//编程配置方言
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
}
