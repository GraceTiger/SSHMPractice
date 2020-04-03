package com.city.controller;

import com.city.factory.ServiceFactory;
import com.city.model.ProductModel;
import com.city.service.IProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet("/product/add.do")
public class EmployeeAddController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code=request.getParameter("code");
		String name=request.getParameter("name");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date=null;
		try {
			date=format.parse(request.getParameter("date"));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		Double unitPrice = Double.valueOf(request.getParameter("unitPrice"));
		Double qtyInStock = Double.valueOf(request.getParameter("qtyInStock"));
		//封装Model对象
		ProductModel pm=new ProductModel();
		pm.setCode(code);
		pm.setName(name);
		pm.setDate(date);
		pm.setUnitPrice(unitPrice);
		pm.setQtyInStock(qtyInStock);
		//取得业务层对象
		IProductService ps=ServiceFactory.createProductService();
		try {
			ps.add(pm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("add.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
