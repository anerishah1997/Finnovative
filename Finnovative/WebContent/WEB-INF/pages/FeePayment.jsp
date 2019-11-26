<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pay Fees</title>
 <link rel="stylesheet" href="css/main.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
</head>
<body>

 <div class="full-height" id="grad1">
    <header>
            <div>
                <img src="images/logo.png" alt="logo" width="8%">
            </div>
    <div class="navbar">
        <a href="index.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
        <a style="float:right" href="adminlogin.html">Logout</a>            
        <a style="float:right" href="adminlogin.html">About Us</a>
        <a style="float:right" href="index.html">FAQs</a>
    </div> 
    </header>
    <form action="activateUser.do" method="post">
    <table align="center" style="margin-left:auto;margin-right:auto;margin-top:4%;margin-bottom:0%">
        <tr>
            <th>Fees Payment</th>
        </tr>
        <tr>
           <td>Amount to be paid:</td>
            <td>
            <input type="text" value='<c:out value="${requestScope.fee}"></c:out>' readonly >
            </td>
        </tr>
        <tr>
            <td>
            <input type="submit"  value="Pay Now" >
            </td>
        </tr>
    </table>
    </form>
    <footer class="footer1"> 
        <p align="center">©Copyright Finnovative Financial Services</p>
    </footer> 
</div>


<%--  <div class="full-height" id="grad1">
<header>
<div><img src="images/logo.png" alt="logo" width="8%"></div>
   
          </header>

<form action="activateUser.do" method="post">
<table>
	<tr>
 	<td><input type="text" value='<c:out value="${requestScope.fee}"></c:out>' readonly></td>
	</tr>
	
	<tr>
	<td>
	<input type="submit" value="PayNow" ></td>
	</tr>
</table>
</form>
		
	
</form>
</div> --%>
</body>
</html>