package com.lti.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String user=request.getParameter("username");
		String ecode=request.getParameter("empcode");
		String dept=request.getParameter("rad");
		String date=request.getParameter("date");
		String month=request.getParameter("month");
		String year=request.getParameter("year");
		String address=request.getParameter("address");
		String check[]=request.getParameterValues("check");
               
		response.setContentType("text/html");
               PrintWriter out=response.getWriter();
               out.println("<html>");
               out.println("<body>");
               out.println("<table>");
               out.println("<tr>");
               out.println("<td>Employee Name</td>");
               out.println("<td>"+user+"</td>");
               out.println("</tr>");
               
               out.println("<tr>");
               out.println("<td>Employee code</td>");
               out.println("<td>"+ecode+"</td>");
               out.println("</tr>");
               
               out.println("<tr>");
               out.println("<td>Department</td>");
               out.println("<td>"+dept+"</td>");
               out.println("</tr>");
               
               out.println("<tr>");
               out.println("<td>Date of Joining</td>");
               out.println("<td>"+date+"/"+month+"/"+year+"</td>");
               out.println("</tr>");
               
               out.println("<tr>");
               out.println("<td>Address</td>");
               out.println("<td>"+address+"</td>");
               out.println("</tr>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			
	}

}
