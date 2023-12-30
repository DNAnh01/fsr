<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<body>
	<form action="${pageContext.request.contextPath}/customer/processForm"
		method="post">
		<div>
			<label>First name: </label> <input type="text" name="firstName"
				placeholder="What's your first name?" />
		</div>
		<div>
			<label>Last name: </label> <input type="text" name="lastName"
				placeholder="What's your last name?" />
		</div>
		<div>
			<label>Age: </label> <input type="number" name="age"
				placeholder="What's your age" />
		</div>
		<input type="submit" value="Submit query" />
	</form>
</body>
</html>