package com.zxc.controller;

import com.zxc.model.Customer;
import com.zxc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/process")
    public ModelAndView add(Customer customer){
        if (customer.getNo()==null || customer.getNo()==0){
            customerService.add(customer);
        }else{
            customerService.update(customer);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        List<Customer> customerList = customerService.findAll();
        mv.addObject("customerList",customerList);
        return mv;
    }
}
