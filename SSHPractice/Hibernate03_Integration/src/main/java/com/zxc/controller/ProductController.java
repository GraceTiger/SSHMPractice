package com.zxc.controller;

import com.zxc.model.Product;
import com.zxc.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("/add")
    public String add(Product product){
       productService.add(product);
       return "success";
    }
}
