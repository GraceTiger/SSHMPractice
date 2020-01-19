package com.zxc.factory;

import com.zxc.service.IAccountService;
import com.zxc.service.impl.AccountServiceImpl;

public class ServiceFactory {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
