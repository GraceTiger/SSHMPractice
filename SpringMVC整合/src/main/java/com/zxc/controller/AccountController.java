package com.zxc.controller;

import com.zxc.model.Account;
import com.zxc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/selectAll")
    public String selectAll(){
        List<Account> accountList = accountService.selectAll();
        for (Account account : accountList) {
            System.out.println("account = " + account);
        }
        return "result";
    }
    @RequestMapping("/insert")
    public String insert(Account account){
        accountService.insert(account);
        return "result";
    }
}
