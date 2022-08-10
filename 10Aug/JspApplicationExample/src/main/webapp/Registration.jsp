<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String driver=application.getInitParameter("drivername");
out.println(driver);
application.setAttribute("username", "Mohit");


%>
<a href="Login.jsp">Login</a>
</body>
</html>