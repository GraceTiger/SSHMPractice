package com.zxc.dao;

import com.zxc.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.*;

public interface IUserDao {

        //查询所有
        @Select("select * from user")
        List<User> selectAll();
        //插入
        @Insert("insert into user(id,username,birthday,sex,address) values()")
        void insert();
}
