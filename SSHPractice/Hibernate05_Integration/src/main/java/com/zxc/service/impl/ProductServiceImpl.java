package com.zxc.service.impl;

import com.zxc.model.Area;
import com.zxc.model.Product;
import com.zxc.service.IProductService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional
public class ProductServiceImpl implements IProductService{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Product product) {
        product.getPackaging().setProduct(product);
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public void addArea(int pNo, int aNo) throws Exception {
        Product product = sessionFactory.getCurrentSession().get(Product.class,pNo);
        product.getAreas().add(sessionFactory.getCurrentSession().get(Area.class,aNo));
    }

    @Override
    public void addAreas(int pNo, int[] aNos) throws Exception {
        Product product = sessionFactory.getCurrentSession().get(Product.class,pNo);
        product.getAreas().clear();
        for (int aNo : aNos) {
            product.getAreas().add(sessionFactory.getCurrentSession().get(Area.class, aNo));
        }
    }
}
