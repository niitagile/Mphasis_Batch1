<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="studentbeans.Student" scope="session" />
 <jsp:getProperty property="sname" name="obj"/>
 <jsp:getProperty property="address" name="obj"/>
</body>
</html>