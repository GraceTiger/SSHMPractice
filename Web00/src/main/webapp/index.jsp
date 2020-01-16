<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder" %>
<%@ page import="com.zxc.dao.IUserDao" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.zxc.model.User" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<%
    //1.读取配置文件
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

    //2.创建SqlSessionFactory工厂
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);

    //3.创建SqlSession对象
    SqlSession ssession = factory.openSession();

    //4.创建Dao接口的代理对象
    IUserDao userDao = ssession.getMapper(IUserDao.class);
    List<User> userList = userDao.selectAll();
    for (User user : userList){
        System.out.println(user);
    }
    ssession.close();
    in.close();
%>
</html>
