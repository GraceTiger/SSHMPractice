package com.zxc.dao;

import com.zxc.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.*;

public interface IUserDao {

        //查询所有
        @Select("select * from user")
        List<User> selectAll();
        //查询所有带账号
        @Select("select * from user")
        @Results(id = "UserMap",value = {
                @Result(id = true,column = "id",property = "id"),
                @Result(column = "username",property = "username"),
                @Result(column = "birthday",property = "birthday"),
                @Result(column = "sex",property = "sex"),
                @Result(column = "address",property = "address"),
                @Result(column = "id",property = "accountList",many = @Many(select = "com.zxc.dao.IAccountDao.selectByUid",
                        fetchType = FetchType.LAZY))
        })
        List<User> selectAllWithAccount();
        //查询单个
        @Select("select * from user where id=#{id}")
        User selectById(int id);
        //插入
        @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
        void insert(User user);
        //修改
        @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
        void update(User user);
        //删除
        @Delete("delete from user where id = #{id}")
        void delete(int id);
}
