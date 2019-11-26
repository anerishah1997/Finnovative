<%@ page errorPage="Error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product details</title>
<link rel="stylesheet" href="css/nav.css">
<script type="text/javascript" src="js/buyProducts.js"></script>

</head>
<body>
	<form action="pay.do" method="post" onsubmit="Validate();">

		<table align="center"
			style="margin-left: auto; margin-right: auto; margin-top: 4%; margin-bottom: 0%; height: 120; width: 40%;">

			<tr>
				<td rowspan="4"><img src="images/${ product.productImage }"
					id="img" style="width: 15em; height: 15em;"></td>
			</tr>
			<tr>

				<td><h3>
						<c:out value="${ product.productName }" />
					</h3></td>
			</tr>
			<tr>
				<td><c:out value="${ product.productDetails }" /></td>
			</tr>
			<tr>
				<input type="hidden" id="price" name="x"
					value="${ product.productPrice }">
				<td><h3>
						Rs.
						<c:out value="${ product.productPrice }" />
					</h3></td>
			</tr>
			<tr>

				<td>SELECT YOUR EMI PLAN :-</td>
				<td><select name="noOfMonths" id="noOfMonths"
					onchange="calculateEMI()">
						<option value="select">Select month</option>

						<option value="3">3 Months</option>
						<option value="6">6 Months</option>
						<option value="9">9 Months</option>
						<option value="12">12 Months</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2">Your Calculated EMI is:<input type="text"
					id="calculatedEMI" name="calculatedEMI" onkeyup="Validate();" readonly ></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Pay Now"
					width="30%"></td>
			</tr>



		</table>




	</form>
</body>
</html>