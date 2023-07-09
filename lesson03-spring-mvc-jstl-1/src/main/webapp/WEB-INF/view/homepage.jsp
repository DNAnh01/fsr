<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>
	.text-error {
		color: red;
	}
</style>
</head>
<body>
	<h2>Welcome to Spring MVC - JSTL</h2>
	<hr>
	<!-- http://localhost:8080/lesson03-spring-mvc-jstl-1/showForm -->
	<!-- the a chi gui request la get -->
	<a href="${pageContext.request.contextPath}/helloworld/showForm">Click to show Hello World Form</a>
	<br>
	<a href="${pageContext.request.contextPath}/customer/showForm">Click to show Customer Form</a>
	
	<br>
	<a href="${pageContext.request.contextPath}/student/showForm">Click to show Student Form</a>
	<hr>
	<h2 class="text-error">All the best</h2>
</body>
</html>