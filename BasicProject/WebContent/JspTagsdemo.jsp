<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Elements/Tags</title>
</head>
<body>
	<%! int month=5; %> <!-- -declaration tag -->
	
	<%if(month==2)
	{
	%>
	<a>Its February</a>
	<%
	}
	else
	{
	%>
	<a>Any month other than February</a>
	<%
	}
	%>
	
	<%
		switch(month)
		{
		case 1: 
			break;
			
		case 2: 
			break;
			
		
			
		}
	%>
	
</body>
</html>