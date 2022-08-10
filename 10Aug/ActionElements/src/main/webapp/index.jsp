<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Front page of Website</h1>
	<jsp:include page="printHello.jsp">
	<jsp:param name="course" value="Java"/>
	</jsp:include>
</body>
</html>