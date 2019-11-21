<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center" border="1" style="margin-left:auto;margin-right:auto;margin-top:4%;margin-bottom:0%;height:120; width:80%;" >
        
        <c:forEach var="user" items="${ requestScope.userList }">
			<c:url var="verifyUserUrl" value="verifyUser.do">
				<c:param name="userId" value="${ user.userId }"/>
			</c:url>
			<c:url var="rejectUserUrl" value="rejectUser.do">
				<c:param name="userId" value="${ user.userId }"/>
			</c:url>
			<tr>
				<td>User Id: </td>
				<td><c:out value="${ user.userId }"/></td>
			</tr>
			
			<tr>
				<td>Full Name: </td>
				<td><c:out value="${ user.fullName }"/></td>
			</tr>
			
			<tr>
				<td>Mobile Number: </td>
				<td><c:out value="${ user.mobileNumber }"/></td>
			</tr>
			
			<tr>
				<td>Email: </td>
				<td><c:out value="${ user.email }"/></td>
			</tr>
				
			<tr>
				<td>Username: </td>
				<td><c:out value="${ user.username }"/></td>
			</tr>	
			
			<tr>
				<td>Password: </td>
				<td><c:out value="${ user.password }"/></td>
			</tr>
			<tr>
				<td>Address: </td>
				<td><c:out value="${ user.address }"/></td>
			</tr>
			<tr>
				<td>Annual Income: </td>
				<td><c:out value="${ user.annualIncome }"/></td>
			</tr>
			<tr>
				<td>Card Type: </td>
				<td><c:out value="${ user.cardType }"/></td>
			</tr>
			
			<tr>
				<td>Bank Name: </td>
				<td><c:out value="${ user.bankName }"/></td>
			</tr>
			
			<tr>
				<td>Account Number: </td>
				<td><c:out value="${ user.accountNumber }"/></td>
			</tr>
			<tr>
				<td>IFSC Code: </td>
				<td><c:out value="${ user.ifscCode }"/></td>
			</tr>
			<tr>
				<td>Aadhar Card: </td>
				<td><c:out value="${ user.aadharDoc }"/></td>
			</tr>
			<tr>
				<td>Status: </td>
				<td><c:out value="${ user.status }"/></td>
			</tr>
				<tr>
				<td><a href='<c:out value="${ verifyUserUrl }"/>'> Verify   </a> </td>
				<td><a href='<c:out value="${ rejectUserUrl }"/>'> Reject   </a> </td>
				</tr>
				
		</c:forEach>
        
    </table>
</body>
</html>