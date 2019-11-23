<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="css/nav.css">
  
<title>Finnovative Finance Services</title>
</head>
<style>


</style>
<body>
<h1><b><i>FINNOVATIVE</i></b></h1>
    <div class="navbar">
            <a href="indexPage"><i class="fa fa-fw fa-home"></i> Home</a>
            <a href="registerPage"><i class="fa fa-fw fa-search"></i> Register</a>
            <a href="ProductListPage"><i class="fa fa-fw fa-envelope"></i> Browse Products</a>
            <a href="userloginPage"><i class="fa fa-fw fa-user"></i> Login</a>
            <a style="float:right" href="adminLoginPage"><i class="fa fa-fw fa-user"></i> Admin</a>
          </div>
    <form action="viewProduct.do" method="get" id="index">
        <h2 style="color:dimgrey"><i>Welcome to Finnovative Financial Services. We have with us a list of products 
                         with attractive emi offers.</i></h2>
        <!-- Slideshow container -->
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
			
		 	 <!-- <img src="images/onePlus7.jpg" alt="op7" style="width:100%">
		 	 <h1>OnePlus 7</h1>
		 	 <p class="price">Rs.33000/-</p>
		 	 <p><button>BUY NOW</button></p> -->
		</div>
		</div>
		 <!-- <div class="column">
      	<div class="card">
			  <img src="images/onePlus5.jpg" alt="op5" style="width:100%">
			  <h1>OnePlus 5</h1>
			  <p class="price">Rs.35000/-</p>	 
			  <p><button>BUY NOW</button></p>
			</div>
			</div> -->
			</div>
    </form>

</body>
</html>