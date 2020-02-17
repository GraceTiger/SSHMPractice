package com.zxc.service.impl;

import com.zxc.dao.IAccountDao;
import com.zxc.model.Account;
import com.zxc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> selectAll() {
        System.out.println("AccountServiceImpl.selectAll");
        return accountDao.selectAll();
    }

    @Override
    public Account selectById(Integer id) {
        System.out.println("AccountServiceImpl.selectById");
        return accountDao.selectById(1);
    }

    @Override
    public void insert(Account account) {
        System.out.println("AccountServiceImpl.insert");
        accountDao.insert(account);
    }
}
