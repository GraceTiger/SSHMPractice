package com.city.service.impl;

import com.city.factory.HibernateFactory;
import com.city.model.CategoryModel;
import com.city.service.IProductCategoryService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCategoryServiceImpl implements IProductCategoryService {
    @Override
    public List<CategoryModel> findAll() throws Exception {
        SessionFactory sf= HibernateFactory.createSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Query<CategoryModel> query=session.createQuery("from CategoryModel",CategoryModel.class);
        List<CategoryModel> list=query.getResultList();
        tx.commit();
        session.close();
        return list;
    }

    @Override
    public CategoryModel findByNo(int no) throws Exception {
        SessionFactory sf= HibernateFactory.createSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        CategoryModel category = session.get(CategoryModel.class,no);
        tx.commit();
        session.close();
        return category;
    }
}
