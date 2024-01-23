<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 	String tenDN = request.getParameter("uname");
	String mk = request.getParameter("upass");
	if(tenDN.equals("ABC") && mk.equals("MNK"))
		response.sendRedirect("UserProfile.html");
		else 
		response.sendRedirect("Login.html");
	%>
</body>
</html>