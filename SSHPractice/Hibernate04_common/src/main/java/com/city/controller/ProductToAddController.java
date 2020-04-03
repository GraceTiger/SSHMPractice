package com.city.controller;

import com.city.model.CategoryModel;
import com.city.service.IProductCategoryService;

import com.city.service.impl.ProductCategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpSession;

import java.util.List;


@WebServlet("/product/toadd.do")
public class ProductToAddController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IProductCategoryService productCategoryService = new ProductCategoryServiceImpl();
		List<CategoryModel> categorys = null;
		try {
			categorys = productCategoryService.findAll();
			request.setAttribute("categorys",categorys);
			request.getRequestDispatcher("add.jsp").forward(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
