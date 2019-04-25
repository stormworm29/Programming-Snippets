<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form:form method="POST" action ="updateemp" modelAttribute="employee">
        <table>
        	<tr>
                <td><label for="name">Id: </label> </td>
                <td><form:input path="id" id="id"/></td>
                <td><form:errors path="id" cssClass="error"/></td>
            </tr>
            <tr>
                <td><label for="name">Name: </label> </td>
                <td><form:input path="name" id="name"/></td>
                <td><form:errors path="name" cssClass="error"/></td>
            </tr>
         
            <tr>
                <td><label for="salary">Salary: </label> </td>
                <td><form:input path="salary" id="salary"/></td>
                <td><form:errors path="salary" cssClass="error"/></td>
            </tr>
     
            <tr>
                <td colspan="3">
                    <input type="submit" value="Register"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>