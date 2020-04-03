package com.zxc.service.impl;

import com.zxc.model.Product;
import com.zxc.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productServiceWithAop")
public class ProductServiceImplWithAop implements IProductService {

    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
