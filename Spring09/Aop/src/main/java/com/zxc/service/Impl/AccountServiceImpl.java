package com.zxc.service.Impl;

import com.zxc.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

    @Override
    public void save() {
        System.out.println("执行了保存");
    }

    @Override
    public void update(int i) {
        System.out.println("执行了更新"+i);
    }


    @Override
    public int delete() {
        System.out.println("执行了删除");
        return 0;
    }
}
