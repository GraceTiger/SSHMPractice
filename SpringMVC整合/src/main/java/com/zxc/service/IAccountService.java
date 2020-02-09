package com.zxc.service;

import com.zxc.model.Account;

import java.util.List;

public interface IAccountService {

    public List<Account> selectAll();

    public Account selectById(Integer id);

    public void insert(Account account);

}
