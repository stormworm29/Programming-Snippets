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
	<h1> <myjsp:locale name="registerform"/> </h1>
	<form action="register.do" method="get">
	<input type = "hidden" name = "handler" value = "register"/>
		<myjsp:locale name="userid"/>: <input type = "number" name = "uid"/><br/>
		<myjsp:locale name="username"/>: <input type = "text" name = "uname"/><br/>
		<myjsp:locale name="password"/>: <input type = "password" name = "upass"/><br/>
		<input type = "submit" value = "<myjsp:locale name='register'/>"/>
	</form>
</body>
</html>