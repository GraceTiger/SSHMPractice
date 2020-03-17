package com.city.controller;

import com.city.model.EmployeeModel;
import com.city.service.IEmployeeService;
import com.city.service.impl.EmployeeServiceImpl;

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

/**
 * 部门增加后处理控制器
 */
@WebServlet("/employee/add.do")
public class EmployeeAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeAddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday=null;
		Date joinDate=null;
		try {
			birthday=format.parse(request.getParameter("birthday"));
			joinDate=format.parse(request.getParameter("joinDate"));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		String cardId = request.getParameter("cardId");
		//封装Model对象
		EmployeeModel em=new EmployeeModel();
		em.setId(id);
		em.setName(name);
		em.setSex(sex);
		em.setBirthday(birthday);
		em.setJoinDate(joinDate);
		em.setCardId(cardId);
		//取得业务层对象
		IEmployeeService es=new EmployeeServiceImpl();
		try {
			es.add(em);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("add.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
