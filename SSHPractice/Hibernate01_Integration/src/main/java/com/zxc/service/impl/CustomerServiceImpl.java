package com.zxc.service.impl;

import com.zxc.model.Customer;
import com.zxc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void add(Customer customer) {
        hibernateTemplate.save(customer);
    }

    @Override
    public void update(Customer customer) {
        hibernateTemplate.update(customer);
    }

    @Override
    public List<Customer> findAll() {
        return hibernateTemplate.findByExample(new Customer());
    }
}
