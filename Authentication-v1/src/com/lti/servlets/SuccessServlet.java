package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success.view")
public class SuccessServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("In success page:doGet");
		String user=request.getParameter("username");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome to success page "+user+"</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("In success page:doPost");
		String user=request.getParameter("username");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome to success page: "+user+"</h1>");
	}

}
