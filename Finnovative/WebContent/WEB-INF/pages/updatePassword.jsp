<%@ page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">
</head>
<body>
	<header>
	<div>
		<img src="images/logo.png" alt="logo" width="8%">
	</div>

	</header>
	<form action="updatePass.do" method="post">
		<table align="center">

			<input type="hidden" name="email" value="${email}">
			<tr>
				<td>Enter new password:</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>Confirm password:</td>
				<td><input type="password" name="pass2"></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Update Password"></td>
			</tr>
		</table>
	</form>

</body>
</html>

