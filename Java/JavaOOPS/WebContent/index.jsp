<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Choose the Language</h1>
	<form action="lang.do" method="get">
		<input type = "hidden" name = "handler" value = "lang"/> 
		<select name = "language">
			<option value = "en"> English </option>
			<option value = "ta"> Tamil </option>
			<option value = "te"> Telugu</option>
		</select>
		<input type = "submit" value = "submit language"/>
	</form>
</body>
</html>