package com.zxc.service.impl;

import com.zxc.service.IAccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
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
