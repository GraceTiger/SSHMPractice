package com.zxc.controller;

import com.zxc.model.Customer;
import com.zxc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/process")
    public void add(Customer customer){
        if (customer.getNo()==null || customer.getNo()==0){
            customerService.add(customer);
        }else{
            customerService.update(customer);
        }
    }

}
