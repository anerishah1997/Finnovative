<%@ page errorPage="Error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Under Verification</title>
 <link rel="stylesheet" href="css/main.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">

<!-- <script type="text/javascript">
	$(document).ready(function(){
		$.ajax({
			type:'GET',
			url: 'feePaymentPage'
		})
	})
</script> -->
</head>
<body>
<div class="full-height" id="grad1">
<section>
    <div>
    <img src="images/logo.png" alt="logo" width="8%">
    </div>
  <div class="navbar">
            <a href="indexPage">Home</a>
 			
            <a style="float:right" href="logOut.do">Logout</a>
          
          </div>
          </section>


<%-- <c:forEach  items="${ requestScope.user }">
			<c:url var="feePayUrl" value="payFee.do">
				<c:param name="userName" value="${ user.username }"/>
			</c:url>
			<h1>Click <a href='<c:out value="${ feePayUrl }"/>'>here</a> to refresh</h1>

</c:forEach> --%>
<c:choose>
<c:when test="${user.status == 'VERIFIED' }">
<c:redirect url="payFee.do"></c:redirect>
<%-- <c:url var="feePayUrl" value="">
				<c:param name="userName" value="${ user.username }"/>
	</c:url>
			<h1>Click <a href='<c:out value="${ feePayUrl }"/>'>here</a> to refresh</h1>
 --%>
</c:when>
<c:otherwise>


Your Details are under Verification...Please refresh to login further.
</c:otherwise>
</c:choose>


	



</body>
</html>