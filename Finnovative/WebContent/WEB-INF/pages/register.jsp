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
<div class="navbar">
            <a href="index.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
            <a href="register.jsp"><i class="fa fa-fw fa-search"></i> Register</a>
            <!-- <a href="productlist.jsp"><i class="fa fa-fw fa-envelope"></i> Browse Products</a>
            <a href="userlogin.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
            <a style="float:right" href="adminlogin.html"><i class="fa fa-fw fa-user"></i> Admin</a> -->
          </div>
    <table  align="center" border="1" style="margin-left:auto;margin-right:auto;margin-top:5%;margin-bottom:0%">
        <tr><td>
    <form action="registerUser.do" method="post">
       
        <table align="center">
            <tr>
                
                <td><label>Full Name:</label></td>
                <td><input type ="text" name="FullName"/></td>
            </tr>
            <tr>
                <td><label>Phone No:</label></td>
                <td><input type="text" name="PhoneNo"></td>
            </tr>
            <tr>
                    <td><label>Email::</label></td>
                    <td><input type="text" name="Email"></td>
            </tr>

            <tr>
                    <td><label>Username:</label></td>
                    <td><input type="text" name="Username"></td>
             </tr>

             <tr>
                    <td><label>Password:</label></td>
                     <td><input type="password" name="Password"></td>
            </tr>
            
            <tr>
                   <td><label>Confirm Password:</label></td>
                   <td><input type="password" name="ConfirmPassword"></td>
             </tr>
             <tr>
                    <td><label>Address:</label></td>
                    <td><input type="text" name="Address"></td>
            </tr>
            <tr>
                <td><label>Annual Income:</label></td>
                 <td><input type="text" name="income"></td>
        </tr>
            <tr>
                <th>Card Type</th>
                <td>
                 <input type="radio" class="Card" name="Card"  value="Gold">Gold
                 <input type="radio" class="Card" name="Card"  value="Titanium">Titanium 
                  <!-- <select name= "Card" id="card">
                    <option value="Gold">Gold</option>
                    <option value="Titanium">Titanium</option>
                </select> -->
                </td>
            </tr>
            <tr>
                <th>Select Bank</th>
                <td>
                    <select name="Bank" id="bank">
                        <option value="HDFC">HDFC</option>
                        <option value="Standard Chartered">Standard Chartered</option>
                        <option value="IDBI">IDBI</option>
                        <option value="ICIC">ICIC</option>
                        <option value="HSBC">HSBC</option>
                    </select>

                </td>
            </tr>
            <tr>
                    <td><label>Account Number</label></td>
                    <td><input type="text" name="AccountNumber"></td>
          </tr>
          <tr>
                <td><label>IFSC code:</label></td>
                <td><input type="text" name="IFSCcode"></td>
            </tr>
            <tr>
            <td colspan="2" align="center"><input type="submit" value="Register"/></td></tr>
            </tr>
            
        </table>
    </form>
    </body>
</td>
</tr>
</table>


</body>
</html>