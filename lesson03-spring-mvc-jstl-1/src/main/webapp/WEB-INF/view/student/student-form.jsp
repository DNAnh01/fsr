<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	margin: 0;
	padding: 20px;
}

form {
	background-color: #fff;
	border: 1px solid #ccc;
	padding: 20px;
	max-width: 400px;
	margin: 0 auto;
}

label {
	display: block;
	margin-bottom: 10px;
}

input[type="text"], input[type="number"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 16px;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>

</head>
<!-- khi ma load cai form nay ra thi hien tai da nhan dc doi tuong student -->
<body>
	<%-- ${student} --%>
	<form:form modelAttribute="student"
		action="${pageContext.request.contextPath}/student/processForm"
		method="post">
		<div>
			<label>Id: </label> <form:input type="text" path="id"
				placeholder="What's your id?" />
		</div>
		<div>
			<label>Full name: </label> <form:input type="text" path="fullName"
				placeholder="What's your full name?" />
		</div>
		<div>
			<label>Age: </label> <form:input type="number" path="age"
				placeholder="What's your age" />
		</div>
		<input type="submit" value="Submit query" />
	</form:form>
</body>
</html>