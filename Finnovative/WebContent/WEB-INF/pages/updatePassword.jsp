<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/main.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
</head>
<body>
 <header>
        <div>
        <img src="images/logo.png" alt="logo" width="8%">
        </div>
        
    </header>
	<form action="updatePass.do" method="post">
	<table align="center" >
	
	<input type="hidden" name="email" value="${email}">
	<tr>
	<td>Enter new password:</td>
	<td><input type="password" name="pass" ></td>
	</tr>
	<tr>
	<td>Confirm password:<input type="password" name="pass2"></td>
	<td><input type="submit" value="Update Password"></td>
	</tr>
	</table>
	</form>
</body>
</html>

<%-- <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="css/main.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
   <!--  <script src="js/resetPassword.js"></script> -->
</head>
<body>
<div class="full-height" id="grad1">
    <header>
        <div>
        <img src="images/logo.png" alt="logo" width="8%">
        </div>
        <div class="navbar">
            <a href="index.html">Home</a>
            <a href="register.html">Register</a>
            <a href="productlist.html">Browse Products</a>
            <a href="userlogin.html">Login</a>
            <a style="float:right" href="adminlogin.html">Admin</a>
        </div>
    </header>

    <h2 align="center">Reset Password</h2>
        <form action="updatePass.do" method="post" id="resetPassword">
        <table align="center" >
            <tr>
            <td><input type="hidden" name="email" value="${email}"></td></tr>
            <tr>
                <td><label>New Password</label></td>
                <td><input type ="password" name="newPassword" id="newPassword" placeholder="Enter password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 7 or more characters" onkeyup="Reset();" required/></td>
          </tr>
          <tr>
          <td><label>Confirm Password</label></td>
                <td><input type="password" name="confirmNewPassword" id="confirmNewPassword" placeholder="Re-enter password" onkeyup="Reset();" required></td>
            </tr>
            <tr colspan="2">
                    <td></td><td style="text-align: right; color:red; font-style:italic" id="newPasswordError"></td> 
                </tr>
            <tr colspan="2">
                <td></td><td style="text-align: right; color:red; font-style:italic" id="confirmNewPasswordError"></td> 
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button" value="UpdatePassword" id="save"/></td>
            </tr>
        </table>
        </form>
    <footer class="footer1"> 
            <p align="center">©Copyright Finnovative Financial Services</p>
    </footer> 
</div>
</body>
</html> --%>