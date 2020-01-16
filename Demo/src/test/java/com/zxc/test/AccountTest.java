package com.zxc.test;

import com.zxc.dao.IAccountDao;
import com.zxc.model.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class AccountTest {
    private InputStream in = null;
    private SqlSessionFactoryBuilder builder = null;
    private SqlSessionFactory factory = null;
    private SqlSession session = null;
    private IAccountDao accountDao = null;

    @Before
    public void init() throws Exception{
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory工厂
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);

        //3.创建SqlSession对象
        session = factory.openSession();

        //4.创建Dao接口的代理对象
        accountDao = session.getMapper(IAccountDao.class);

    }

    @After
    public void destroy() throws Exception{
        //提交事务
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }

    @org.junit.Test
    public void testSelectAll(){
        //5.执行方法
        List<Account> accountList = accountDao.selectAll();
        for (Account account : accountList){
            System.out.println(account);
        }
    }
}
