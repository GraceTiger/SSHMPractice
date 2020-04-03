package com.zxc.service.impl;

import com.zxc.model.Area;
import com.zxc.service.IAreaService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service("areaService")
@Transactional
public class AreasServiceImpl implements IAreaService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Area> findAll() throws Exception {
        return sessionFactory.getCurrentSession()
                .createQuery("from Area",Area.class)
                .getResultList();
    }
}
