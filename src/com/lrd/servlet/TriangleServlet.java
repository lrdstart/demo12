package com.lrd.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lrd.bean.Triangle;

public class TriangleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Triangle t=  new Triangle();;
		try {
			Double sideA = Double.parseDouble(request.getParameter("sideA"));
			Double sideB = Double.parseDouble(request.getParameter("sideB"));
			Double sideC = Double.parseDouble(request.getParameter("sideC"));
			t.setA(sideA);
			t.setB(sideB);
			t.setC(sideC);
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		request.getSession().setAttribute("Triangle", t);
		response.sendRedirect("show.jsp");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
