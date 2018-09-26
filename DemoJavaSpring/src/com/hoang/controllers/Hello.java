package com.hoang.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/index.html")
public class Hello  extends HttpServlet {
	
	@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	  String msg = "Get duoc goi ";
	  
	  String name="Hoang"; 
	     int age= 8;
	     req.setAttribute("name",name);
	     req.setAttribute("age", age);
	     req.setAttribute("myMSG", msg);
     req.getRequestDispatcher("./WEB-INF/jsp/viewone.jsp").forward(req, resp);
    
}
	
	/*
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hoten= req.getParameter("fullname");
		int luong= Integer.parseInt(req.getParameter("luong"));
		req.setAttribute("hoten", hoten);
		req.setAttribute("luong", luong);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
	
	*/
}
