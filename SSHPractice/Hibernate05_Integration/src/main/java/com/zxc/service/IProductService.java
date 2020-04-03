package com.zxc.service;

import com.zxc.model.Product;

public interface IProductService {
    public void add(Product product) throws Exception;
    public void addArea(int pNo,int aNo) throws Exception;
    public void addAreas(int pNo ,int[] aNos) throws Exception;
}
