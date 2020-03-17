package com.city.factory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.hibernate.SessionFactory;

public class HibernateFactory {
	private static SessionFactory sf=null;
	//XML方式配置hibernate
	public static SessionFactory createSessionFactory() throws Exception{
		Context ctx = null;
		try {
			ctx = new InitialContext();
			sf=(SessionFactory)ctx.lookup("oasf");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return sf;
	}
}
