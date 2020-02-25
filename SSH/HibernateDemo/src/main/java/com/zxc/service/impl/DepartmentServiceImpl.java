package com.zxc.service.impl;

import com.zxc.model.Department;
import com.zxc.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void add(Department department) {
        //把对象添加到数据库中
       hibernateTemplate.save(department);
    }
}
