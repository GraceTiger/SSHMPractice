package com.zxc.service.impl;

import com.zxc.model.Product;
import com.zxc.service.IProductService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }

}
