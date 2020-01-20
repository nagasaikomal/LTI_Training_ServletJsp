<%@page import="com.lti.basic.Employee" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
  Employee emp=new Employee();
  emp.setEmpId(1001);
  emp.setEmpName("Komal");
  emp.setEmpSal(10000.00);
  %>
  
  <h2>Employee Details</h2>
  
  <%
  	out.println("<br/>ID:"+emp.getEmpId());
    out.println("<br/>Name:"+emp.getEmpName());
    out.println("<br/>Salary:"+emp.getEmpSal());
  %>
  
  <h2>Employee Details</h2>
  
  <table border="1">
  <tr>
  <th colspan="2">Employee info</th>
  </tr>
  
  </table>
  
  
</body>
</html>