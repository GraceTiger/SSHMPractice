package com.zxc.service.impl;


import com.zxc.model.Category;
import com.zxc.service.ICategoryService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> findAll() throws Exception {
        return sessionFactory.getCurrentSession()
                .createQuery("from Category",Category.class)
                .getResultList();
    }

    @Override
    public Category findByNo(int no) throws Exception {
        return sessionFactory.getCurrentSession().get(Category.class,no);
    }
}
