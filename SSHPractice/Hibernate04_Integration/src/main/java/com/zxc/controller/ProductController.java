package com.zxc.controller;

import com.zxc.model.Category;
import com.zxc.model.Product;
import com.zxc.service.ICategoryService;
import com.zxc.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("/toAdd")
    public String toAdd(Model model) throws Exception {
        List<Category> categorys = categoryService.findAll();
        model.addAttribute("categorys",categorys);
        return "forward:add.jsp";
    }

    @RequestMapping("/add")
    public String add(Product product) throws Exception {
       productService.add(product);
       return "redirect:toAdd";
    }


}
