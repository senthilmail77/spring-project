<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Sample Form</title>

<style>
body {
	background-color: #eee;
	font: helvetica;
}

#container {
	width: 500px;
	background-color: #fff;
	margin: 30px auto;
	padding: 30px;
	border-radius: 5px;
}

.green {
	font-weight: bold;
	color: green;
}

.message {
	margin-bottom: 10px;
}

label {
	width: 70px;
	display: inline-block;
}

form {
	line-height: 160%;
}

.hide {
	display: none;
}
</style>
</head>
<body>

	<div id="container">

		<h2>LOGIN-PAGE</h2>
	
		<form:form modelAttribute="LoginForm" action="/myapp/validateLogin">
			<label for="username">User Name: </label>
			<form:input path="userName" id="username" />
			<font color="red"> <form:errors path="userName"></form:errors></font><br/>
			<br />
			<label for="password">Password: </label>
			<form:input path="password" id="password" />
			<font color="red"> <form:errors path="password"></form:errors></font><br/>
			<br />
			<br />
			<br />
			<input type="submit" value="Submit" />
		</form:form>
	</div>

</body>
</html>