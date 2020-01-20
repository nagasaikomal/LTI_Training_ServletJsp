<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
Enter a String <input type="text" name="user"/>
<input type="submit" value="Go" />
</form>
<ul>
<li>Current date time: <%=new java.util.Date() %>
<li>host name:<%=request.getRemoteHost() %>
<li>sessionID:<%= session.getId() %>
<li>Data from parameter: <%=request.getParameter("user") %>
</ul>
<%session.setAttribute("classId ","LTI batch 11"); %>
<%session.setAttribute("user1", request.getParameter("user")); %>
<a href="Data.jsp">click here to get username</a>

</body>
</html>