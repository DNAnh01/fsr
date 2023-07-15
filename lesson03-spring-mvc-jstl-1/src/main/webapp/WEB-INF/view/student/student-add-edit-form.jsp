<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/import.jsp"%>

<!-- Using for add, edit page 
	+ add: show empty form with input
	+ edit: show from with data of current student
-->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT ${title} PAGE</title>

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
	<h2>STUDENT ${title} PAGE</h2>

	<hr>
	
	<!-- path >> getter, setter attribute from model attribute -->
	
	<form:form action="${contextPath}/student/save" modelAttribute="student" method="POST">
		<!-- cai save co method la post -->
		<form:input path="id" placeholder="Id"/>
		<form:input path="fullName" placeholder="Full Name"/>
		<form:input path="age" placeholder="Age"/>
		
		<form:select path="country">
			<c:forEach var="countryAsItem" items="${countries}">
				<form:option value="${countryAsItem}">${countryAsItem}</form:option>
			</c:forEach>
		</form:select> <br> <br>
		
		<c:forEach var="operatingSystemAsItem" items="${operatingSystems}">
			<form:checkbox path="operatingSystems" value="${operatingSystemAsItem}" label="${operatingSystemAsItem}"/>
		</c:forEach> <br> <br>
		
		
		<input type="submit" value="Save Student">
	</form:form>
</body>
</html>