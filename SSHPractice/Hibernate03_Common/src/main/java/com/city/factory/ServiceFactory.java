package com.city.factory;

import com.city.service.IProductService;
import com.city.service.impl.ProductServiceImpl;

public class ServiceFactory {
    public static IProductService createProductService(){
        return new ProductServiceImpl();
    }
}
