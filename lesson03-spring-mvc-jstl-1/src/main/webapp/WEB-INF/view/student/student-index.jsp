<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglib/import.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>STUDENT INDEX PAGE</title>
<style>
/* CSS styles go here */
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	border: 1px solid black;
	padding: 8px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

.btn-add {
	color: white;
	font-size: 22px;
	padding: 10px;
	background: #4CAF50;
	border: 1px solid black;
	border-radius: 3px;
	display: inline-block;
	width: 80px;
	text-align: center;
	cursor: pointer;
	text-decoration: none;			
}
</style>
</head>
<body>
	<h2>STUDENT INDEX PAGE</h2>

	<hr>
	
	<a href="${contextPath}/student/add" class="btn-add"> + </a>
	
	<hr>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Full Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.fullName}</td>
					<td>${student.age}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>