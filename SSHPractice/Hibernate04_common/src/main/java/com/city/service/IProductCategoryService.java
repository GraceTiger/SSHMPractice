package com.city.service;

import com.city.model.CategoryModel;

import java.util.List;

public interface IProductCategoryService {
    public List<CategoryModel> findAll() throws Exception;
    public CategoryModel findByNo(int no) throws Exception;
}
