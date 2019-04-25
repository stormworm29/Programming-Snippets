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
	<h1><myjsp:locale name="fruitcat"/></h1>
	<form action = "add.do" method="get">
		<input type = "hidden" name = "handler" value = "shop">
		<input type = "hidden" name = "next" value = "shop2">
		<myjsp:locale name='mango'/> :<input type="checkbox" name="c1" value="mango">
		<myjsp:locale name='banana'/> :<input type="checkbox" name="c2" value="banana">
		<myjsp:locale name='orange'/> :<input type="checkbox" name="c3" value="orange">
		<input type="submit" value = "<myjsp:locale name='shop'/> 2....>"/>
	</form>
</body>
</html>