<%@ page errorPage="Error.jsp" %>
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
 <form action="checkOtp.do" method="get">
  <table align="center">
            <tr>
                <td><label>ENTER OTP</label></td>
                <td><input type ="text" name="OTP" placeholder ="Enter OTP" / required></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" class="button"  name ="OTP" id ="OTP" value="SUBMIT"/></td></tr>
            </tr>
         
             <input type="hidden" name="otp" value="${otp}">
             <input type="hidden" name="email" value="${email }">
          
        </table>
</form>
</body>
</html>