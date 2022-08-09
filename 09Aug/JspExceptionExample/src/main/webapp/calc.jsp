<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int num1=Integer.parseInt(request.getParameter("txtNum1"));
int num2=Integer.parseInt(request.getParameter("txtNum2"));
int ans=num1/num2;
out.println("division of number="+ans);
%>
</body>
</html>