<%@ page errorPage="Error.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="css/main.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">
<title>Document</title>
</head>
<body>
	<div class="full-height" id="grad1">
		<header>
			<div>
				<img src="images/logo.png" alt="logo" width="8%">
			</div>
			<div class="navbar">
				<a href="index.jsp">Home</a> <a href="register.jsp">Register</a> <a
					href="productlist.jsp">Browse Products</a> <a href="userlogin.jsp">Login</a>
				<a style="float: right" href="adminlogin.html"> Admin</a>
			</div>
		</header>
		<h3 align="center">Forget Password</h3>

		<form action="forgotpassword.do" method="get">
			<table align="center">

				<tr>
					<td><label>Email Id</label></td>
					<td><input type="text" name="email"
						placeholder="Enter your EmailId" / required></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						class="button" name="forgot_password" id="forgot_password"
						value="Send Email" /></td>
				</tr>
				</tr>
			</table>
		</form>
		<form action="checkOtp.do" method="get">
			<table align="center">
				<tr>
					<td><label>ENTER OTP</label></td>
					<td><input type="text" name="OTP" placeholder="Enter OTP"
						/ required></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						class="button" name="OTP" id="OTP" value="SUBMIT" /></td>
				</tr>
				</tr>

				<input type="hidden" name="otp" value="${otp }">
				<input type="hidden" name="email" value="${email }">

			</table>
		</form>
		<footer class="footer1">
			<p align="center">©Copyright Finnovative Financial Services</p>
		</footer>
	</div>
</body>
</html>