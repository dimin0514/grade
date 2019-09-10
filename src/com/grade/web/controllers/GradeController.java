package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.GradeBean;
import com.grade.web.serviceimpls.GradeServiceImp;
import com.grade.web.services.GradeService;

@WebServlet("/grade.do")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//studentNum, name, ssn, kor, eng, math, soc;
		GradeService service = new GradeServiceImp();
		String name=request.getParameter("name");
		String ssn=request.getParameter("ssn");
		String kor=request.getParameter("kor");
		String eng=request.getParameter("eng");
		String math=request.getParameter("math");
		String soc=request.getParameter("soc");
		GradeBean param = new GradeBean();

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
