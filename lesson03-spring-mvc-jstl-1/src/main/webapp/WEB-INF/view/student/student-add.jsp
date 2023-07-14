<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/import.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT ADD PAGE</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
        margin: 0;
        padding: 20px;
    }

    h2 {
        color: #333;
    }

    hr {
        border: none;
        border-top: 1px solid #ddd;
        margin: 20px 0;
    }

    form {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ddd;
        border-radius: 3px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
	<h2>STUDENT ADD PAGE</h2>

	<hr>

	<form:form action="${contextPath}/student/save" modelAttribute="student" method="POST">
		<!-- cai save co method la post -->
		<form:input path="id" placeholder="Id"/>
		<form:input path="fullName" placeholder="full name"/>
		<form:input path="age" placeholder="age"/>
		
		<input type="submit" value="Add Student">
	</form:form>
</body>
</html>