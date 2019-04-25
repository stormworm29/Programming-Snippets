<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%out.println((String)request.getAttribute("title")); %></title>
</head>
<body>
<h1>Hello User</h1>
<p><%out.println((String)request.getAttribute("message")); %></p>
</body>
</html>