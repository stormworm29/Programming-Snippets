<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Page</title>
</head>
<body>
	<h1>Form page is here</h1>
	<form:form action ="submitform" modelAttribute="student">
		<label>Name</label><form:input path= "name" id= "name"/>
		<label>Age</label><form:input path = "age" id = "age"/>
		<input type="submit" value="register"/>
	</form:form>
</body>
</html>