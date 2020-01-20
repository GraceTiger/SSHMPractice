package com.zxc.service.impl;

import com.zxc.dao.IAccountDao;
import com.zxc.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao ;

    public AccountServiceImpl(){
        System.out.println("Account对象创建了");
    }

    public void  saveAccount(){
        System.out.println("Account对象保存了。。。");
    }
}
