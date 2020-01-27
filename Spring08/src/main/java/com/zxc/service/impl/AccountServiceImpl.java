package com.zxc.service.impl;

import com.zxc.dao.IAccountDao;
import com.zxc.model.Account;
import com.zxc.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Resource(name = "accountDao")
    private IAccountDao accountDao;


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
