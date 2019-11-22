<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pay Fee</title>
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


YOUR DETAILS ARE UNDER VERFICATION...
</c:otherwise>
</c:choose>


	



</body>
</html>