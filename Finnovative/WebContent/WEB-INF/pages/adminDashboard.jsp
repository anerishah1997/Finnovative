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
			<a href="adminDashboardPage"> Dashboard</a> <a style="float: right"
				href="logOut.do">Log out</a>
		</div>
		</header>

		<table class="tab" align="center" cellpadding="8px"
			style="padding-top: 5px; padding-bottom: 5px">
			<tr>
				<th>Name</th>
				<th>EMAIL</th>
				<th>Account Number</th>
				<th>Status</th>
				<th>View Details</th>

			</tr>
			<c:forEach var="user" items="${ requestScope.userList }">
				<c:url var="viewDetailsUrl" value="viewDetails.do">
					<c:param name="userId" value="${ user.userId }" />
				</c:url>
				<tr>
					<td><c:out value="${ user.fullName }" /></td>
					<td><c:out value="${ user.email }" /></td>
					<td><c:out value="${ user.accountNumber }" /></td>
					<td><c:out value="${ user.status }" /></td>
					<td><a href='<c:out value="${ viewDetailsUrl }"/>'>View
							Details</a></td>
				</tr>
			</c:forEach>

		</table>

		<footer class="footer1">
		<p align="center">ęCopyright Finnovative Financial Services</p>
		</footer>
	</div>
</body>
</html>