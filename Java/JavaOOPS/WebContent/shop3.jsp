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
	<jsp:include page="logout.jsp" />
	<h1><myjsp:locale name='juicecat'/></h1>
	<form action = "add.do" method="get">
		<input type = "hidden" name = "handler" value = "shop"/>
		<input type = "hidden" name = "next" value = "invoice"/>
		<myjsp:locale name='mangojuice'/> : <input type="checkbox" name="c7" value="mangojuice"/>
		<myjsp:locale name='bananajuice'/> : <input type="checkbox" name="c8" value="bananajuice"/>
		<myjsp:locale name='orangejuice'/>:<input type="checkbox" name="c9" value="orangejuice"/>
		<input type="submit" value = "<myjsp:locale name='invoice'/> ....>"/>
	</form>
</body>
</html>