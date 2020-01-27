package com.zxc.service.impl;

import com.zxc.dao.IAccountDao;
import com.zxc.model.Account;
import com.zxc.service.IAccountService;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> selectAll() throws SQLException {
        return accountDao.selectAll();
    }

    @Override
    public Account selectById(Integer id) throws SQLException {
        return accountDao.selectById(id);
    }

    @Override
    public void insert(Account account) throws SQLException {
        accountDao.insert(account);
    }

    @Override
    public void update(Account account) throws SQLException {
        accountDao.update(account);
    }

    @Override
    public void delete(Integer id) throws SQLException {
        accountDao.delete(id);
    }
}
