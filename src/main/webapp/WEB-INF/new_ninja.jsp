<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/addninja" method="post" modelAttribute="ninja">
		<div>
			<form:label path="dojo"></form:label>
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="d">
					<form:option value="${d}"><c:out value="${d.name}"></c:out></form:option>
				</c:forEach>
			</form:select>
		</div>
		<div>
			<form:label path="first_name">First name: </form:label>
			<form:input path="first_name"/>
		</div>
		<div>
			<form:label path="last_name">Last name: </form:label>
			<form:input path="last_name"/>
		</div>
		<div>
			<form:label path="age">Age: </form:label>
			<form:input path="age"/>
		</div>
		<input type="submit" value="Create"/>	
	</form:form>
</body>
</html>