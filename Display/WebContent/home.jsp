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
	String name =  request.getParameter("fullname");
	String userName = request.getParameter("userName");
	String pass = request.getParameter("pass");
	String addr = request.getParameter("address");
	String age = request.getParameter("age");
	String qual = request.getParameter("qual");
	String percent = request.getParameter("percent");
	String year = request.getParameter("yop"); 
%>
<table >
<tr>
	<td>Full Name</td>
	<td><%= name %></td>
</tr>
<tr>
	<td>userName</td>
	<td><%= userName %></td>
</tr>
<tr>
	<td>Address</td>
	<td><%= addr %></td>
</tr>
<tr>
	<td>Age</td>
	<td><%= age %></td>
</tr>
<tr>
	<td>Qualification</td>
	<td><%= qual %></td>
</tr>
<tr>
	<td>Percentage</td>
	<td><%= percent %></td>
</tr>
<tr>
	<td>Year of Passed</td>
	<td><%= year %></td>
</tr>
</table>
<br>
</body>
</html>