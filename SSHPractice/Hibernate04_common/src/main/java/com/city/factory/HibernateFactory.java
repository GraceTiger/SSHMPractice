package com.city.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {
	//单例模式创建sessionFactory
	private static SessionFactory sessionFactory=null;
	//XML方式配置Hibernate
	public static SessionFactory createSessionFactory() throws Exception{
		if(sessionFactory==null) {
			Configuration cfg=new Configuration();
			cfg.configure();
			sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}
