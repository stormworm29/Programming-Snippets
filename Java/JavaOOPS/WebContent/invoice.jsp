<%@page import="applicationcontext.DBActionImpl"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/mytags.tld" prefix="myjsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="logout.jsp" />
<body>
	<myjsp:invoice/><br/>
	<a href = "shop1.jsp"><myjsp:locale name="shopagain"/></a>
</body>
</html>