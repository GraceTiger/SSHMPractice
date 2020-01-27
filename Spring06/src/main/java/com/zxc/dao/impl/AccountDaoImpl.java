package com.zxc.dao.impl;

import com.zxc.dao.IAccountDao;
import com.zxc.model.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements IAccountDao {

    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    @Override
    public List<Account> selectAll() throws SQLException {
        return runner.query("select * from account",new BeanListHandler<Account>(Account.class));
    }

    @Override
    public Account selectById(Integer id) throws SQLException {
        return runner.query("select * from account where id = ?",new BeanHandler<Account>(Account.class),id);
    }

    @Override
    public void insert(Account account) throws SQLException {
        runner.update("insert into account(ID,UID,MONEY) values(?,?,?)",account.getId(),account.getUid(),account.getMoney());
    }

    @Override
    public void update(Account account) throws SQLException {
        runner.update("update account set UID=?,MONEY=? where id=?",account.getUid(),account.getMoney(),account.getId());
    }

    @Override
    public void delete(Integer id) throws SQLException {
        runner.update("delete from account where ID=?",id);
    }
}
