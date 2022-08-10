<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="studentbeans.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%
 Student obj=(Student)session.getAttribute("obj");
 out.println("name="+obj.getSname());
 out.println("address="+obj.getAddress());
 %>
 
</body>
</html>