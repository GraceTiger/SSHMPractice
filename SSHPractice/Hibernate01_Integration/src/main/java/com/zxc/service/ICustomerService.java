package com.zxc.service;

import com.zxc.model.Customer;

import java.util.List;

public interface ICustomerService {
    public void add(Customer customer);
    public void update(Customer customer);
    public List<Customer> findAll();
}
