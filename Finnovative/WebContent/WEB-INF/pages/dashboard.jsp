<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="css/nav.css">
    
<title>Insert title here</title>
</head>
<body>
<body><h1><b><i>FINNOVATIVE</i></b></h1>
    <div >
            <a href="indexPage"><i class="fa fa-fw fa-home"></i> Home</a>
            <!-- <a href="register.html"><i class="fa fa-fw fa-search"></i> Register</a> -->
            <a href="ProductListPage"><i class="fa fa-fw fa-envelope"></i> Browse Products</a>
            <!-- <a href="userlogin.html"><i class="fa fa-fw fa-user"></i> Login</a> -->
            <a style="float:right" href="logOut.do"><i class="fa fa-fw fa-user"></i>Log out</a>
          </div>

          <div  >
                <table style="margin-left:auto;margin-right:auto;margin-top:4%;margin-bottom:0%; 
                                border-style:solid">
                    <tr>
                        <td>
                        <p class="cardNumber">Card Number:<input type="text" name="cardNumber" value="${emicard.cardNumber}" readonly="readonly"></p>
                        <p></p>
                        </td>
                    </tr>
                    <tr>
                       <td>
                        <p class="name" >Name:<input type="text" name="name" value="${emicard.user.fullName}" readonly="readonly"></p>
                        <p></p>
                       
                    </tr>
                    <tr>
                        <td>
                        <p class="validTill">Valid Till:
  						<input type="text" name="validity" value="${emicard.validityExp}" readonly="readonly"></p>
                     
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <p class="cardType">Card Type
                        <input type="text" name="validity" value="${emicard.cardType}" readonly="readonly"></p>

                        </td>
                    </tr>
                
     
                 </table>
                 <table>
                 	<tr>
                 		<td>
                        <p class="cardType"> TotalCredit
                        <input type="text" name="validity" value="${emicard.totalCredit}" readonly="readonly"></p>

                        </td>
                 	</tr>
                 	<tr>
                 		<td>
                        <p class="cardType"> CreditUsed
                        <input type="text" name="validity" value="${emicard.creditUsed}" readonly="readonly"></p>

                        </td>
                 	</tr>
                 	<tr>
                 		<td>
                        <p class="cardType"> RemainingCredit
                        <input type="text" name="validity" value="${emicard.remainingCredit}" readonly="readonly"></p>

                        </td>
                 	</tr>
                 </table>
                </div>

</body>
</html>