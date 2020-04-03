package com.city.service.impl;

import com.city.factory.HibernateFactory;
import com.city.model.ProductModel;
import com.city.service.IProductService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductServiceImpl implements IProductService {

    @Override
    public void add(ProductModel pm) throws Exception {
        //创建SessionFactory对象
        SessionFactory sf = HibernateFactory.createSessionFactory();
        //创建Session
        Session session = sf.openSession();
        //开启事务
        Transaction tx = session.beginTransaction();
        //完成Model对象增加到记录到表中
        session.save(pm);
        //提交事务
        tx.commit();
        //关闭Session
        session.close();
    }
}
