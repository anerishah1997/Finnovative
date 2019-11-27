<%@ page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/cards.css">
<link
	href="https://fonts.googleapis.com/css?family=Raleway&display=swap"
	rel="stylesheet">

<title>Finnovative Finance Services</title>
</head>

<body>
	<div class="full-height" id="grad1">
		<header>
		<div>
			<img src="images/logo.png" alt="logo" width="8%">
		</div>
		<div class="navbar">
			<a href="indexPage"> Home</a> <a href="registerPage"> Register</a> <a
				href="ProductListPage"> Browse Products</a> <a href="userloginPage"></i>
				Login</a> <a href="aboutUsPage"> About US</a> <a style="float: right"
				href="adminLoginPage"> Admin</a>
		</div>
		</header>
		<div>
			<marquee style="color: #2D4B73;" direction="left">
				<h3>No cost EMI is available on wide range of products from
					Apple, OnePlus and Samsung.</h3>
			</marquee>
		</div>
		<pre>Welcome to Finnovative Financial Services. Finnovative Financial Service is expertise in EMI service in which Consumer is provided with four 
  types of EMI option as 3 months, 6 months, 9 months, 12 months with <b>ZERO INTEREST RATE.</b>
  </pre>
		<form action="userloginPage" method="get" id="index">
			<div class="row">
				<c:forEach var="prod" items="${ requestScope.productList }">

					<div class="column">
						<div class="product">

							<img src="images/${ prod.productImage }" alt="img"
								style="width: 100%">
							<p>
								<c:out value="${ prod.productName }" />
							</p>
							<p>
								<b><c:out value="${ prod.productDetails }" /></b>
							</p>
							<p>
								<b>Rs. <c:out value="${ prod.productPrice }" /></b>
							</p>

							<button type="submit" name="productId" class="button">BUY
								NOW</button>
						</div>
					</div>

				</c:forEach>
			</div>


			<%--  <!-- Slideshow container -->
    	 <div class="row">
 		 <div class="column">
			<div class="card">
			<c:forEach var="prod" items="${ requestScope.productList }">
 	    <tr>
			<td rowspan="4"> <img src ="images/${ prod.productImage }" id="img" style="width:15em; height:15em;" ></td>
		</tr>	
		<tr>
			<td><h3><c:out value="${ prod.productName }"/></h3></td>
		</tr>	
		<tr>
			<td><c:out value="${ prod.productDetails }"/></td>
		</tr>
		<tr>
			<td><h3>Rs. <c:out value="${ prod.productPrice }"/></h3></td>
		</tr>
		<tr>
		    <td> <p><button type="submit" name="productId" >BUY NOW</button></p></td>
		</tr>
			
		</c:forEach>
			
		</div>
		</div>
	
			</div> --%>
		</form>
		<footer class="footer"
			style="margin-top:2%; padding-top:5%;padding-bottom:5%">
		<p align="center">©Copyright Finnovative Financial Services</p>
		</footer>
	</div>

</body>
</html>