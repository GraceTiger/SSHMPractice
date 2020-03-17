package com.zxc.controller;

import com.zxc.model.Employee;
import com.zxc.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/add")
    public ModelAndView add(Employee employee){
        employeeService.add(employee);
        List<Employee> employeeList = employeeService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("employeeList",employeeList);
        mv.setViewName("result");
        return mv;
    }
}
