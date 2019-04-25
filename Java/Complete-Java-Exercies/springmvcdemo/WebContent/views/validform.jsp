<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%=request.getAttribute("aaa") %>
<body>
	<s:form commandName="validbean" method="post" action="register">
	UserNAme:<s:input path="userName"/>
		 Age:<s:input path="age"/>
	PassWord:<s:input path="password"/>
		<input type="submit" value="Register">
	</s:form>
</body>
</html>