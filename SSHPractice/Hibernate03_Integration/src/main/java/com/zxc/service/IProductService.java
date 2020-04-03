package com.zxc.service;

import com.zxc.model.Product;

import java.util.List;

public interface IProductService {
    public void add(Product pruduct);
    public List<Product> findAll();
}
