<%@ page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/main.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">
<script src="js/adminLogin.js"></script>
<title>Admin Login</title>
</head>
<body>
	<div class="full-height" id="grad1">
		<header>
		<div>
			<img src="images/logo.png" alt="logo" width="8%">
		</div>
		<div class="navbar">
			<a href="indexPage"> Home</a>

		</div>
		</header>
		<h2 align="center">
			<b>ADMIN LOGIN</b>
		</h2>
		<form action="adminlogin.do" method="post">

			<table align="center">

				<tr>

					<td><label>Username</label></td>
					<td><input type="text" name="adminLogin" id="username"
						placeholder="Enter username" /></td>
				</tr>
				<tr colspan="2">
					<td></td>
					<td style="text-align: right; color: red; font-style: italic"
						id="userNameError"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" name="adminPassword" id="password"
						placeholder="Enter password"></td>
				</tr>
				<tr colspan="2">
					<td></td>
					<td style="text-align: right; color: red; font-style: italic"
						id="passwordError"></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="Login" onclick="validate()" /></td>
				</tr>
				</tr>
			</table>
		</form>
		<footer class="footer1">
		<p align="center">©Copyright Finnovative Financial Services</p>
		</footer>
</body>
</div>
</body>
</html>