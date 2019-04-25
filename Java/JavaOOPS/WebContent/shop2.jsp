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
	<h1><myjsp:locale name='vegetablescat'/></h1>
	<form action = "add.do" method="get">
		<input type = "hidden" name = "handler" value = "shop">
		<input type = "hidden" name = "next" value = "shop3">
		<myjsp:locale name='brinjal'/> :<input type="checkbox" name="c4" value="brinjal">
		<myjsp:locale name='cabbage'/> :<input type="checkbox" name="c5" value="cabbage">
		<myjsp:locale name='beans'/> :<input type="checkbox" name="c6" value="beans">
		<input type="submit" value = "<myjsp:locale name='shop'/> 3....>"/>
	</form>
</body>
</html>