<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<body>

<form:form method="post" action="login" commandName="logincommand">
		
		UserName:<form:input path="username" />
		
		PassWord:<form:password path="password" />
		
		<input type="submit" value="Submit" />
		<input type="button" value="submit" onClick="this.form().submit()">
</form:form>

</body>

