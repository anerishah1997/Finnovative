<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="css/main.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
    <title>User Login</title>
    <script src="js/userLogin.js"></script>
</head>
<body>
<div class="full-height" id="grad1">
    <header>
        <div>
        <img src="images/logo.png" alt="logo" width="8%">
        </div>
<div class="navbar">
            <a href="indexPage"> Home</a>
            <a href="userlogin.jsp">Login</a>
           
          </div>
          </header>
          <h2 align="center"><b><i>USER LOGIN</i></b></h2>
    <form action="userlogin.do" method="post">
    <table align="center">
       <tr>
                
                <td><label>Username</label></td>
                <td><input type ="text" name="userLogin" id="userName" placeholder="Enter username"/></td>
            </tr>
             <tr colspan="2">
                <td></td><td style="text-align: right; color:red; font-style:italic" id="userNameError"></td> 
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><input type="password" name="userPassword" id="userPassword" placeholder="Enter password"></td>
            </tr>
            <tr colspan="2">
                <td></td><td style="text-align: right; color:red; font-style:italic" id="passwordError"></td>
            </tr>
            <tr>
            <td colspan="2" align="center"><input type="submit" value="Login" class="button" onclick="validate()"/></td></tr>
            </tr>
             <tr>
                 <td><a href="">forgot password?</a></td>
                 <td><a href="registerPage">New User? Register here!</a></td>
             </tr>
        </table>
    </form>
     <footer class="footer1" > 
            <p align="center">©Copyright Finnovative Financial Services</p>
        </footer> 
    </body>

</body>
</html>