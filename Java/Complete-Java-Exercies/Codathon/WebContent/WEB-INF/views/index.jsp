<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 
    .error {
        color: #ff0000;
    }
</style>
</head>
<body>
	<h1> Welcome to the Project</h1>
	<h2>List of Employees</h2>  
    <table>
        <tr>
            <td>Id</td><td>Name</td><td>Salary</td>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.salary}</td>
            </tr>
        </c:forEach>
    </table>
	<h2>To Display the Employee</h2>
  	<form:form method="POST" action ="view" modelAttribute="employee">
  		<label for="name">Id: </label>
  		<form:input path="id" id="id"/>
  		<form:errors path="id" cssClass="error"/>
  		
  		 <input type="submit" value="Display Employee"/>
  	</form:form>
  	<h2>To Add the Employee</h2>
    <form:form method="POST" modelAttribute="employee">
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
    
    <h2>Update the Employee Values</h2>
  	<form:form method="POST" action ="update" modelAttribute="employee">
  		<label for="name">Id: </label>
  		<form:input path="id" id="id"/>
  		<form:errors path="id" cssClass="error"/>
  		<input type="submit" value="Update the Employee"/>
  	</form:form>
    <br/>
    <br/>
   
</body>
</html>