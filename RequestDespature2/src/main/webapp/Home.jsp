<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String myname = (String) session.getAttribute("name_key");
 %>
 <h1>Welcome to this page <%= myname %></h1>
 
 <a href="Home.jsp">Home</a> &nbsp; &nbsp;
 <a href="welcome.jsp">welcome</a> &nbsp; &nbsp;
 
</body>
</html>