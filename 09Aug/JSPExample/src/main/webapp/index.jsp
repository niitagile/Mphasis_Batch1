<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
	<h1>login</h1>
	<form method="get" action="index.jsp">
		Enter Uname:<input type="text" name="user" required><br />
		Enter Password:<input type="password" name="pass" required><br />
		<input type="submit" value="check">
	</form>
	<%!boolean validate(String uname, String pass) {
		if (uname.equalsIgnoreCase("dhanu") && pass.equals("dhanu@123")) {
			return true;
		}
		return false;
	}%>
	<%
	String uname = request.getParameter("user");
	String password = request.getParameter("pass");
	if (uname != null && password != null) {
		if (validate(uname, password))
			out.println("welcome" + uname);
		else
			out.println("invalid username & password");
	}
	%>
</body>
</html>