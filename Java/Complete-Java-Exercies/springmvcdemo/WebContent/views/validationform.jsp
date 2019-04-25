<%@ page language="java" contentType="text/html; charset=utf-8"

pageEncoding="UTF-8"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
உங்கலை ஸ்ப்ரிங்க் வரவெர்கிரதது
स्प्रिन्ग आप्क स्वगथ कर्थ है

<title>Insert title here</title>

</head>

<body>

<form:form method="post" action="submitform.html" commandName="regform">

<table>

<tr>

<td>User Name:<font color="red"><form:errors path="userName" /></font></td>

</tr>

<tr>

<td><form:input path="userName" /></td>

</tr>

<tr>

<td>Age:<font color="red"><form:errors path="age" /></font></td>

</tr>

<tr>

<td><form:input path="age" /></td>

</tr>

<tr>

<td>Password:<font color="red"><form:errors path="password" /></font></td>

</tr>

<tr>

<td><form:password path="password" /></td>

</tr>

<tr>

<td><input type="submit" value="Submit" /></td>

</tr>

</table>

</form:form>

</body>

</html>