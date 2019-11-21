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

YOUR DETAILS ARE UNDER VERFICATION...
<c:forEach  items="${ requestScope.username }">
			<c:url var="feePayUrl" value="payFee.do">
				<c:param name="userName" value="${ username }"/>
			</c:url>
			<h1>Click <a href='<c:out value="${ feePayUrl }"/>'>here</a> to refresh</h1>

</c:forEach>


</body>
</html>