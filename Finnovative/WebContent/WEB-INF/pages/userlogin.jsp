<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="css/nav.css">
<title>Insert title here</title>
</head>
<body>
<div class="navbar">
            <a href="indexPage"><i class="fa fa-fw fa-home"></i> Home</a>
            <!-- <a href="register.jsp"><i class="fa fa-fw fa-search"></i> Register</a>
            <a href="productlist.jsp"><i class="fa fa-fw fa-envelope"></i> Browse Products</a> -->
            <a href="userlogin.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
            <!-- <a style="float:right" href="adminlogin.html"><i class="fa fa-fw fa-user"></i> Admin</a> -->
          </div>
    <table border="1" align="center" style="margin-left:auto;margin-right:auto;margin-top:20%;margin-bottom:0%">
        <tr><td>
    <form action="userlogin.do" method="post">
       
        <table align="center">
            <tr>
                
                <td><label>Username</label></td>
                <td><input type ="text" name="userLogin"/></td>
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><input type="password" name="userPassword"></td>
            </tr>
            <tr>
            <td colspan="2" align="center"><input type="submit" value="Login"/></td></tr>
            </tr>
             <tr>
                 <td><a href="">forgot password?</a></td>
                 <td><a href="registerPage">New User? Register here!</a></td>
             </tr>
        </table>
    </form>
    </body>
</td>
</tr>
</table>
</body>
</html>