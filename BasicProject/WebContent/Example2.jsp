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
		int num1=10;int num2=50;
		int num3=num1+num2;
		if(num3!=0 || num3>0)
		{
			int num4=num1*num2;
			out.println("Number 4 is "+num4);
			out.println("Number 3 is "+num3);
		}
	%>
	
	<%!
		public String sayHello(String name)
		{
			return "Hello " +name;
		}
	%>
	
	<%=sayHello("Meenal") %>
	
</body>
</html>