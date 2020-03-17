package com.city.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {
	private static SessionFactory sf=null;
	//XML方式配置Hibernate
	public static SessionFactory createSessionFactory() throws Exception{
		if(sf==null) {
			Configuration cfg=new Configuration();
			cfg.configure();
			//读取hibernate.cfg.xml配置文件
			//cfg.configure("config/lhd.cfg.xml");
			//cfg.addClass(DepartmentModel.class);
			//cfg.addResource("com/city/oa/model/DepartmentModel.hbm.xml")
			//
			//cfg.addPackage("com.city.oa.moodel");
			//cfg.addResource("com/city/oa/model/DepartmentModel.hbm.xml");
			//创建SessionFactory对象
			sf=cfg.buildSessionFactory();
		}
		return sf;
	}
}
