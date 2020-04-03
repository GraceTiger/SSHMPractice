package com.city.controller;
import com.city.model.CategoryModel;
import com.city.model.ProductModel;
import com.city.service.IProductCategoryService;
import com.city.service.IProductService;
import com.city.service.impl.ProductCategoryServiceImpl;
import com.city.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product/add.do")
public class ProductAddController extends HttpServlet {

    private static final long serialVersionUID = 2L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        Integer qty = Integer.parseInt(request.getParameter("qty"));
        IProductCategoryService productCategoryService = new ProductCategoryServiceImpl();
        IProductService productService = new ProductServiceImpl();
        CategoryModel category = null;
        try {
            category = productCategoryService.findByNo(Integer.parseInt(request.getParameter("group")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ProductModel product = new ProductModel();
        product.setName(name);
        product.setPrice(price);
        product.setQty(qty);
        product.setCategory(category);
        try {
            productService.add(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("toadd.do");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
