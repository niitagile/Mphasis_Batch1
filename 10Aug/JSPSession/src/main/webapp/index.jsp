<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="index.jsp">
		<input type="text" name="uname"> <input type="submit">

	</form>
	<%
	String uname = request.getParameter("uname");
	Date createTime = new Date(session.getCreationTime());
	if (uname != null)
		session.setAttribute("username", uname);
	session.setAttribute("date", createTime);
	%>
<a href="display.jsp">display</a>
</body>
</html>