
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>

<%
String id = "";
String user_id = request.getParameter("user_id");
String pwd = request.getParameter("pwd");
String name = request.getParameter("name");
String email = request.getParameter("email");
if (!(user_id == null || user_id.isEmpty())) {

String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "naulej";
String userId = "root";
String password = "root";
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
PreparedStatement pstatement = null;
try {
connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
//pstatement = connection.createStatement();

String sql = "INSERT INTO userinfo (user_id,pwd,name,email) VALUES('"+ user_id + "','" + pwd + "','" + name + "','" + email + "')";
pstatement = connection.prepareStatement(sql);
pstatement.setString(1, user_id);
pstatement.setString(2, pwd);
pstatement.setString(3, name);
pstatement.setString(4, email);
int flage = pstatement.executeUpdate(sql);


}

catch (Exception ex) {
    out.println("Unable to connect to batabase.");

       }
    
}

%>

<html>
<head>
<head>
<title>jsp</title>
</head>
<form method="post" action="Registration.jsp">
<table>
<tr>
<td>id</td><td><input type="text" id="id" size="35" /></td>
</tr>
<tr>
<td>user_id</td>
<td><input type=text name="user_name" size="35" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="pwd" size="35" /></td>
</tr> 
<tr>
<td>name</td>
<td><input type="text" name="name" size="35" /></td>
</tr>
<tr>
<td>email</td>
<td><input type="text" name="email" size="35" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="insert" value="Save"></td>
</tr>
</table> 
</form>
</html>
	