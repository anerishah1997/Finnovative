<%@ page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="css/register.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">

</head>
<body>
	<div class="full-height" id="grad1">
		<header>
		<div>
			<img src="images/logo.png" alt="logo" width="8%">
		</div>
		<div class="navbar">
			<a href="viewDashboardPage"> Dashboard</a> 
		</div>
		</header>

		<table class="tab" align="center" cellpadding="8px"
			style="padding-top: 5px; padding-bottom: 5px">
			<tr>
				
				<th>Installment No</th>
				<th>Paid Date</th>
				<th>Due Date</th>
				<th>Installment Status</th>
				

			</tr>
			<c:forEach var="installment" items="${ installments}">
				<tr>
				
					<td><c:out value="${ installment.installmentNo }" /></td>
					<td><c:out value="${ installment.datePaid}" /></td>
					<td><c:out value="${ installment.dueDate}" /></td>
					<td><c:out value="${ installment.installmentStatus}" /></td>
				</tr>
			</c:forEach>

		</table>

		<footer class="footer1">
		<p align="center">©Copyright Finnovative Financial Services</p>
		</footer>
	</div>
</body>
</html>