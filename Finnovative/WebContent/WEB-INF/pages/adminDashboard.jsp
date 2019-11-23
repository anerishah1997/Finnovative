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

 <div >
            <a href="indexPage"><i class="fa fa-fw fa-home"></i> View All Users</a>
            <a style="float:right" href="logOut.do"><i class="fa fa-fw fa-user"></i>Log out</a>
          </div>
<table border="1" align="center" border="1" style="margin-left:auto;margin-right:auto;margin-top:4%;margin-bottom:0%;height:120; width:80%;" >
        <tr>
            <th>Name</th>
            <th>EMAIL</th>
            <th>Account Number</th>
            <th>Status</th>
            <th>View Details</th>
           
        </tr>
        <c:forEach var="user" items="${ requestScope.userList }">
			<c:url var="viewDetailsUrl" value="viewDetails.do">
				<c:param name="userId" value="${ user.userId }"/>
			</c:url>
			<tr>
				<td><c:out value="${ user.fullName }"/></td>
				<td><c:out value="${ user.email }"/></td>
				<td><c:out value="${ user.accountNumber }"/></td>
				<td><c:out value="${ user.status }"/></td>
				<td><a href='<c:out value="${ viewDetailsUrl }"/>'>View Details</a></td>
			</tr>
		</c:forEach>
        
    </table>



</body>
</html>