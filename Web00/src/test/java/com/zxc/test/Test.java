package com.zxc.test;

import com.zxc.dao.IUserDao;
import com.zxc.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Test {

    private InputStream in = null;
    private SqlSessionFactoryBuilder builder = null;
    private SqlSessionFactory factory = null;
    private SqlSession session = null;
    private IUserDao userDao = null;

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
        userDao = session.getMapper(IUserDao.class);

    }

    @After
    public void destroy() throws Exception{
        //6.释放资源
        session.close();
        in.close();
    }

    @org.junit.Test
    public void testSelectAll(){
        //5.执行方法
        List<User> userList = userDao.selectAll();
        for (User user : userList){
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void testInsert(){
        User user = new User();
        user.setId(50);
        user.setSex('女');
        user.setUsername("陆红提");
        user.setBirthday(new Date());
        user.setAddress("吕梁");
        session.commit();
    }
}
