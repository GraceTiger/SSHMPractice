package com.zxc.service.impl;

import com.zxc.model.Employee;
import com.zxc.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void add(Employee employee) {
        //把对象添加到数据库中
       hibernateTemplate.save(employee);
    }
}
