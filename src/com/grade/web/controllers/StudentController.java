package com.grade.web.controllers;
import com.grade.web.daoimps.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.daoimps.GradeDAOImp;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action =request.getParameter("action");
		
		switch(action) {
		case"move": 
			request.getRequestDispatcher(String.format(GradeDAOImp.VIEW_PATH,"student",request.getParameter("dest"))).forward(request,response);
			break;
		case"join": 
			request.getRequestDispatcher(String.format(GradeDAOImp.VIEW_PATH,"student",request.getParameter("dest"))).forward(request,response);
			break;
		case"register": 
			request.getRequestDispatcher("index.jsp").forward(request,response);
			break;
		
		}
		
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
