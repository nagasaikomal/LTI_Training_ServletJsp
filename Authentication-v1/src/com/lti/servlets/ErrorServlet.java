package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/error.view")
public class ErrorServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("In error page:doGet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Login id password incorrect</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("In error page:doPost");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Login id password incorrect</h1>");
	}

}
