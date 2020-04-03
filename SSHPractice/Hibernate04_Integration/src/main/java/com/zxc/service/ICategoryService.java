package com.zxc.service;

import com.zxc.model.Category;
import java.util.List;

public interface ICategoryService {
    public List<Category> findAll() throws Exception;
    public Category findByNo(int no) throws Exception;
}
