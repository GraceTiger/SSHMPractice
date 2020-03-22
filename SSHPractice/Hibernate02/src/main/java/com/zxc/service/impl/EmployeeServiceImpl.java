package com.zxc.service.impl;

import com.zxc.model.Employee;
import com.zxc.service.IEmployeeService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Employee")
                .list();
    }

}
