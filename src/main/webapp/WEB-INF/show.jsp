<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Page</title>
</head>
<body>
	<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
	<table>
		<thead>
			<tr>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Age Name</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
					<td><c:out value="${ninja.first_name}"></c:out></td>
					<td><c:out value="${ninja.last_name}"></c:out></td>
					<td><c:out value="${ninja.age}"></c:out></td>
				</tr>			
			</c:forEach>
		</tbody>
	</table>
</body>
</html>