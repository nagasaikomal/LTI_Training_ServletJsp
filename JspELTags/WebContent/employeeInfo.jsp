<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='1'>
<tr><th colspan="2">Employee Info</th></tr>
<tr><td>ID</td><td>${employee.empId}</td></tr>
<tr><td>Name</td><td>${employee.empName}</td></tr>
<tr><td>Salary</td><td>${employee.empSal}</td></tr>
<tr><td>Vehicle</td><td>${employee.v.vehId}</td></tr>
<tr><td>Address</td><td>${employee.v.vehName}</td></tr>
</table>
<br>

</body>
</html>