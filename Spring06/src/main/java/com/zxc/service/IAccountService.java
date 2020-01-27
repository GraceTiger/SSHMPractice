package com.zxc.service;

import com.zxc.model.Account;

import java.sql.SQLException;
import java.util.List;

public interface IAccountService {
    //查询所有
    List<Account> selectAll() throws SQLException;
    //查询一个
    Account selectById(Integer id) throws SQLException;
    //添加
    void insert(Account account) throws SQLException;
    //修改
    void update(Account account) throws SQLException;
    //删除
    void delete(Integer id) throws SQLException;
}
