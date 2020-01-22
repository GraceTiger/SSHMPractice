package com.zxc.view;

import com.zxc.dao.IAccountDao;
import com.zxc.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        //2.根据id获取Bean对象
        IAccountService as  = (IAccountService)ac.getBean("accountService");
//        IAccountService as2  = (IAccountService)ac.getBean("accountService");
//        System.out.println(as);
//        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
//        System.out.println(adao);
//        System.out.println(as == as2);
        as.saveAccount();
        IAccountDao ad  = (IAccountDao)ac.getBean("accountDao");
        System.out.println(as);
        System.out.println(ad);
        ac.close();
    }
}
