<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="css/cards.css">
<title>Products</title>
</head>
<body>
<div class="full-height" id="grad1">
<section>
    <div>
    <img src="images/logo.png" alt="logo" width="8%">
    </div>
  <div class="navbar">
            <a href="indexPage">Home</a>
            <a href="registerPage">Register</a>
            <!-- <a href="userloginPage">Login</a> -->
          
          </div>
          </section>
          
<c:choose>  
     
  <c:when test="${sessionScope.user != null }">    
	 
	 	
		<form action="buyProduct.do" method="GET" enctype="multipart/form-data">
		 <c:forEach var="prod" items="${ requestScope.productList }">
		 	   
		 	   
		 	   <div align="center">  
        <div class="row" >
          <div class="column">
            <div class="card">
              <img src="images/${ prod.productImage }" alt="OnePlus3" style="width:100%">
             
              <p class="title"><c:out value="${ prod.productName }"/></p>
              <p><b><c:out value="${ prod.productDetails }"/></b></p>
              <p><c:out value="${ prod.productPrice }"/></p>
              <button type="submit" name="productId" value=${prod.productId} >BUY NOW</button>
              <!-- <input type="button" onclick="" name="Buy Now" class="button" value="Buy Now"> -->
            </div>
          </div>
          </div>
          </div>
		 	   
		 	   <%--  <tr>
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
				</tr> --%>
					
		  </c:forEach>
				
		
	
	  </form>
	</c:when>  
    <c:otherwise>
       <c:redirect url="userloginPage"></c:redirect>
    </c:otherwise>
</c:choose>
		
	

 <footer class="footer" style="margin-top:2%"> 
        <p align="center">©Copyright Finnovative Financial Services</p>
    </footer>     
</div>

</body>
</html>