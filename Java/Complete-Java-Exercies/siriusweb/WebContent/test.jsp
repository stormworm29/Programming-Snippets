<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	buffer="17kb"
	autoFlush="false"
	import="java.util.Date,java.io.File,java.util.List"
	errorPage="myerror.jsp"
	isThreadSafe="false"    
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "header.jsp" %>
<jsp:include page="header.jsp">
	<jsp:param value="sirius solutions .. " name="cname"/>
</jsp:include>
<%
//will enter service method
//Can access implicit methods
	for(int i=0;i<100;i++){
		out.println("hello world ..");
	}
String path = application.getRealPath("/");
out.println(path);

%>
<%!
//outside service method
%>
<%=request.getParameter("uname") %><!-- outside service method 
										Single line
										they don't have semicolon at the end
										the output of expression will be printed or assigned to the left hand side variable-->
</body>
</html>