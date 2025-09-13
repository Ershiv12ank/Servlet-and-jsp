<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to jsp </h1>

<%
  String name = "Shivank pandey";
  int len = name.length();
%>

<%= len %>
</body>
</html>