<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/mytags.tld" prefix="myjsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="logout.do" method="get">
		<input type = "hidden" name = "handler" value = "logout"/>
		<input type = "submit" value = "<myjsp:locale name='logout'/>"/>
	</form>
	<hr/>
</body>
</html>