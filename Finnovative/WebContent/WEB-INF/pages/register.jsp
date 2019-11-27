<%@ page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Register</title>
<link rel="stylesheet" href="css/register.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">
<script src="js/register.js"></script>
</head>
<
<body>
	<div class="full-height" id="gradstretch">
		<header>
		<div>
			<img src="images/logo.png" alt="logo" width="8%">
		</div>
		<div class="navbar">
			<a href="indexPage"> Home</a> <a href="registerPage"> Register</a>

		</div>

		</header>


		<h2 align="center">
			<b>Registration Page</b>
		</h2>
		<form action="registerUser.do" method="post" id="reg" name="name"
			enctype="multipart/form-data" onsubmit="AlertUser();">

			<table align="center" class="tab">
				<tr>

					<td>Full Name:</td>
					<td><input type="text" name="fullName" id="fullName"
						placeholder="Enter name" required /></td>

				</tr>
				<tr>
					<td>Mobile No:</td>
					<td><input type="number" name="PhoneNo" id="PhoneNo"
						placeholder="Enter mobile number" onkeyup='MobileNumber();'
						required></td>
				<tr colspan="2">
					<td></td>
					<td style="text-align: right; color: red; font-style: italic"
						id="mobileNumberError"></td>
				</tr>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="Email" id="Email"
						placeholder="Enter email address" required></td>
					<td id="emailError"></td>
				</tr>

				<tr>
					<td>Username:</td>
					<td><input type="text" name="Username" id="username"
						placeholder="Enter username" required></td>
					<td id="userNameError"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="Password" id="password"
						placeholder="Enter password"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,}"
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 7 or more characters"
						required></td>
					<td id="passwordError"></td>
				</tr>

				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="ConfirmPassword"
						id="confirmPassword" placeholder="Enter password"
						onkeyup='Validate();' required></td>
				<tr colspan="2">
					<td></td>
					<td style="text-align: right; color: red; font-style: italic"
						id="confirmPasswordError"></td>
				</tr>
				<tr colspan="2">
					<td></td>
					<td style="text-align: right; color: green; font-style: italic"
						id="passwordError"></td>
				</tr>
				</tr>
				<tr>
					<td>Address:</td>
					<td> <input type="text" name="Address" id="address"
						placeholder="Enter address" required></td>
					<td id="addressError"></td>
				</tr>
				<tr>
					<td>Annual Income:</td>
					<td><input type="number" min="80000" name="income" id="annualIncome"
						placeholder="Enter annual Income" onkeyup="AnnualIncome();"
						required></td>
				<tr colspan="2">
					<td></td>
					<td style="text-align: right; color: blue; font-style: italic"
						id="annualIncomeError"></td>
				</tr>
				</tr>
				<tr>
					<td>Card Type:</td>
					<td><input type="radio" name="Card" id="gold" value="Gold">Gold
						<input type="radio" name="Card" id="titanium" value="Titanium"
						onkeyup="AnnualIncome();">Titanium</td>
					<td id="cardTypeError"></td>
				</tr>
				<tr>
					<td>Select Bank:</td>
					<td><select name="Bank" id="bank">
							<option selected="" value="Default">(Please select a
								Bank)</option>
							<option value="HDFC">HDFC</option>
							<option value="Standard Chartered">Standard Chartered</option>
							<option value="IDBI">IDBI</option>
							<option value="ICICI">ICICI</option>
							<option value="HSBC">HSBC</option>
							<option value="SBI">HSBC</option>

					</select></td>
					<td id="bankError"></td>
				</tr>
				<tr>
					<td>Account Number:</td>
					<td><input type="text" name="AccountNumber" id="accountNumber"
						placeholder="Enter account number" required></td>
					<td id="accountNumberError"></td>
				</tr>
				<tr>
					<td>IFSC code:</td>
					<td><input type="text" name="IFSCcode" id="ifscCode"
						placeholder="Enter IFSC code" required></td>
					<td id="ifscError"></td>
				</tr>
				<tr>
					<td>Upload Aadhar Card:</td>
					<td><input type="file" class="file1" name="aadhar"></td>

				</tr>
				<!-- <tr>
            <td>File to upload: <input type="file" name="file"></td> 
			<td>Enter username to upload file: <input type="text" name="name"></td>
			<td><input type="submit" value="Upload"></td>
       </tr> -->
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Register" /></td>
				</tr>

			</table>
		</form>

		<footer class="footer">
		<p align="center">©Copyright Finnovative Financial Services</p>
		</footer>
	</div>
</body>
</html>