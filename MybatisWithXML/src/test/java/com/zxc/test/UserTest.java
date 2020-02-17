package com.zxc.test;

import com.mysql.cj.xdevapi.SessionFactory;
import com.zxc.dao.IExamDao;
import com.zxc.dao.IUserDao;
import com.zxc.model.Exam;
import com.zxc.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserTest {

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
        //提交事务
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }

    @Test
    public void testSelectAll(){
        //5.执行方法
        List<User> userList = userDao.selectAll();
        for (User user : userList){
            System.out.println(user);
        }
    }

    @Test
    public void testSelectAllWithAccount(){
        List<User> userList = userDao.selectAllWithAccount();
        for (User user : userList){
            System.out.println(user);
        }
    }


    @Test
    public void testSelectById(){
        User user = userDao.selectById(48);
        System.out.println(user);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setSex('女');
        user.setUsername("陆红提");
        user.setBirthday(new Date());
        user.setAddress("吕梁");
        userDao.insert(user);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(58);
        user.setSex('女');
        user.setUsername("陆红提");
        user.setBirthday(new Date());
        user.setAddress("吕梁");
        userDao.update(user);
    }

    @Test
    public void testDelete(){
        userDao.delete(58);
    }
}
