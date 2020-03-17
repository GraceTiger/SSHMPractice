package com.zxc.service;

import com.zxc.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public void add(Employee employee);
    public List<Employee> findAll();
}
