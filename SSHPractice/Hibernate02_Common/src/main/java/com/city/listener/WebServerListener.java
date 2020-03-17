package com.city.listener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import lombok.SneakyThrows;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Application Lifecycle Listener implementation class ServerStartAndStopListener
 *
 */
@WebListener
public class WebServerListener implements ServletContextListener {

    Context ctx = null;

    public void contextDestroyed(ServletContextEvent event)  { 
    	 System.out.println("服务器停止了");
    }

    public void contextInitialized(ServletContextEvent event)  {
         System.out.println("服务器启动了");
         Configuration cfg=new Configuration();
         //读取hibernate.cfg.xml配置文件
         cfg.configure();
         //cfg.addClass(DepartmentModel.class);
         //创建SessionFactory对象
         SessionFactory sf = cfg.buildSessionFactory();
        try {
            ctx = new InitialContext();
            ctx.bind("oasf",sf);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
	
}
