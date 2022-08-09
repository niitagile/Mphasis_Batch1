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
String user=request.getParameter("txtName");
pageContext.setAttribute("username",user,PageContext.SESSION_SCOPE);//SESSION_SCOPE, APPLICATION_SCOPE, PAGE_SCOPE,REQUEST_SCOPE

%>
<a href="Second.jsp">Click</a>
</body>
</html>