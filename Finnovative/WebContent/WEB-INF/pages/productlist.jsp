<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="css/navimg.css">
<title>Products</title>
</head>
<body>
  <div class="navbar">
            <a href="index.html"><i class="fa fa-fw fa-home"></i> Home</a>
            <a href="register.html"><i class="fa fa-fw fa-search"></i> Register</a>
            <a href="userlogin.html"><i class="fa fa-fw fa-user"></i> Login</a>
          
          </div>
<form action="buyProduct.do" method="GET" enctype="multipart/form-data">
 	  <table>

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
		    <td> <p><button type="submit" name="productId" value=${prod.productId} >BUY NOW</button></p></td>
		</tr>
			
		</c:forEach>
		
		</table> 
	
	</form>

		
	

    

</body>
</html>