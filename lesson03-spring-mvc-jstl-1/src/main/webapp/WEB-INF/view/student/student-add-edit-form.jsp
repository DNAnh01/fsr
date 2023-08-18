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
	background: linear-gradient(to right, #4daf54, #3d8880);
}

.title-block {
	display: flex;
	justify-content: center;
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
	opacity: 0.8;
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

.cbx-block {
	display: flex;
	justify-content: space-between;
	align-items: center;
	margin-bottom: 10px;
}

input[type="submit"] {
	width: 100%; color : white;
	background: linear-gradient(to right, #4daf54, #3d8880);
	padding: 10px 20px;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	color: white;
}

input[type="submit"]:hover {
	background: linear-gradient(to right, #3d8880, #4daf54);
}

select {
	width: 100%;
	padding: 10px;
	border-radius: 3px;
}
</style>
</head>
<body>
	<!-- path >> getter, setter attribute from model attribute -->

	<form:form action="${contextPath}/student/save"
		modelAttribute="student" method="POST">
		<div class="title-block">
			<h2>STUDENT ${title} PAGE</h2>
		</div>
		<!-- cai save co method la post -->
		<form:input path="id" placeholder="Id" />
		
		<form:input path="fullName" placeholder="Full Name" />
		<form:errors path="fullName" cssStyle="color: red"/>
		
		<form:input path="age" placeholder="Age" />
		<form:errors path="age" cssStyle="color: red"/>
		
		<form:select path="country">
			<c:forEach var="countryAsItem" items="${countries}">
				<form:option value="${countryAsItem}">${countryAsItem}</form:option>
			</c:forEach>
		</form:select>
		<br>
		<br>

		<div class="cbx-block">
			<c:forEach var="operatingSystemAsItem" items="${operatingSystems}">
				<form:checkbox path="operatingSystems"
					value="${operatingSystemAsItem}" label="${operatingSystemAsItem}" />
			</c:forEach>
			<br> <br>

		</div>
		
		<form:input path="course" placeholder="Course Name" />
		<form:errors path="course" cssStyle="color: red"/>
		<br>
		<br>
		
		<input type="submit" value="Save Student">
	</form:form>
</body>
</html>