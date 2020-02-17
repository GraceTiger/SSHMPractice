package com.zxc.dao;

import com.zxc.model.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {

    @Select(value = "select * from account")
    public List<Account> selectAll();

    @Select(value = "select * from account where id = #{id}")
    public Account selectById(Integer id);

    @Insert(value = "insert into account(id,name,money) values(#{id},#{name},#{money})")
    public void insert(Account account);
}
