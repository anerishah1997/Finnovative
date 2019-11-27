<%@ page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="css/main.css">
<script src="js/dashboard.js"></script>

<title>User Dashboard</title>
</head>
<body>
	<div class="full-height" id="gradstretch">
		<header>
		<div>
			<img src="images/logo.png" alt="logo" width="8%">
		</div>
		<div class="navbar">
			<a href="indexPage">Home</a> <a href="ProductListPage">Browse
				Products</a> <a style="float: right" href="logOut.do">Log out</a>
		</div>
		</header>
		<br>

		<h2 style="margin-left: 10px">
			Hello, <label>${ emicard.user.fullName}</label>
		</h2>

		<div class="row">
			<div class="column">

				<div class="container">
					<div class="virtualCard" style="margin-left: 33%;">
						<table width=100%; padding=3px;>
							<tr>
								<td><img src="images/logo.png" alt="logo" width="50%"></td>
								<td><input type="button" class="activateStatus"
									name="activate" value="ACTIVATED" disabled></td>
							</tr>
							<tr>
								<td><label class="card1">Card Number: </label></td>
								<td><label class="card1">${emicard.cardNumber}</label></td>
								<%-- <td><input class="card1" type="text" name="cardNumber" value="${emicard.cardNumber}" readonly="readonly"></td> --%>
							</tr>

							<tr>
								<td><label class="card1">Validity:</label></td>
								<td><label class="card1">${emicard.validityExp}</label></td>
								<%--  <td><input class="card1" type="text" name="validity" value="${emicard.validityExp}" readonly="readonly"></td> --%>
							</tr>
							<tr>
								<td><label class="card1">Card Type:</label></td>
								<td><label class="card1">${emicard.cardType}</label></td>
								<%--  <td><input class="card1" type="text" name="validity" value="${emicard.cardType}" readonly="readonly"></td> --%>
							</tr>
							<tr>
								<td><label class="card2">${emicard.user.fullName}</label></td>
								<%-- <td><input class="card1" type="text" name="cardNumber" value="${emicard.user.fullName}" readonly="readonly"></td> --%>
							</tr>

						</table>
					</div>
				</div>
			</div>
			<div class="column" style="margin-left: 40%; font-weight: bolder;">


				<table cellpadding=10px;>
					<tr>
						<td><label class="card3">Total credit: </label></td>
						<td><label class="card3">${emicard.totalCredit}</label></td>
					</tr>

					<tr>
						<td><label class="card3">Credit used:</label></td>
						<td><label class="card3">${emicard.creditUsed}</label></td>
					</tr>
					<tr>
						<td><label class="card3">Remaining Credit:</label></td>
						<td><label class="card3">${emicard.remainingCredit}</label></td>
					</tr>


				</table>
			</div>
			<div>


				<%-- <c:when test="${sessionScope.productTransaction != null }"> --%>
				<c:choose>
					<c:when test="${productTransaction != '' }">
						<table
							style="margin-left: auto; margin-right: auto; margin-top: 4%; margin-bottom: 0%; border-style: solid">
							<tr>
								<th>TransactionId</th>
								<th>ProductName</th>
								<th>ProductPrice</th>



							</tr>
							<c:forEach var="productTransaction"
								items="${productTransaction }">
								<c:url var="InstallmentsUrl" value="viewInstallments.do">
								<c:param name="productId" value="${ productTransaction.product.productId }" ></c:param>
								</c:url>
								<tr>
									<td><c:out value="${ productTransaction.transactionId}" />
									</td>

									<td><c:out
											value="${ productTransaction.product.productName}" /></td>
									<td><c:out
											value="${ productTransaction.product.productPrice}" /></td>
									<td><a href='<c:out value="${ InstallmentsUrl }"/>'>View
											Installments</a></td>
								</tr>
							</c:forEach>
						</table>
					</c:when>
				</c:choose>
			</div>


		</div>
		<br> <br> <br>
		<footer class="footer">
		<p align="center">©Copyright Finnovative Financial Services</p>
		</footer>
	</div>
</body>
</html>