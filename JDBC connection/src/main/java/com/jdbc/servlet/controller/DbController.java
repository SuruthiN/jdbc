package com.jdbc.servlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.jdbc.servlet.db.DataBaseUtil;
import com.jdbc.servlet.dto.User;

/**
 * Servlet implementation class DbController
 */
public class DbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("username");
		String Email=request.getParameter("email");
		String password=request.getParameter("password");
		User user =new User();
		user.setUserName(UserName);
		user.setEmail(Email);
		user.setPassword(password);
		DataBaseUtil db =new DataBaseUtil();
		String result = db.save(user);
		response.getWriter().print(result);
	}

}
