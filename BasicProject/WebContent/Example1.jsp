<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! int num=5; %>
<% out.println("Numbers are:"); 
for(int i=0;i<num;i++)
{
 out.println(i);
}
%>
<%! int day=2; int i=1; %>
<% while(day>=i)
{
	if(day==i)
	{
		out.println("Its monday");
		break;
	}
	i++;
}
%>
</body>
</html>