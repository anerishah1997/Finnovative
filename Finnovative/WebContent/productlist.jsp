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
            <!-- <a href="productlist.html"><i class="fa fa-fw fa-envelope"></i> Browse Products</a> -->
            <a href="userlogin.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
            <!-- <a style="float:right" href="adminlogin.html"><i class="fa fa-fw fa-user"></i> Admin</a> -->
          </div>
    <table align="right">
        <tr>
            <td><input type="button" onclick="" name="Logout" value="Logout"></td>
        </tr>
        
        <div class="Product">
        <table style="margin-left:10%;margin-right:auto;margin-top:4%;margin-bottom:0%">
            <tr>
                <td>
                <img src="images/op7.jpg" alt="OnePlus7" style="width:40%">
                <h1>One Plus 3</h1>
                <p class="title">Product Name: One Plus 3</p>
                <p><b>Product Cost: Rs.22,000/-</b></p>
                <input type="button" onclick="" name="Buy Now" value="Buy Now">
            </td>
            </tr>

            <tr>
                    <td>
                    <img src="Documents/images.jpg" alt="OnePlus3T" style="width:100%">
                    <h1>One Plus 3T</h1>
                    <p class="title">Product Name: One Plus 3T</p>
                    <p>The OnePlus 3 is a powerhouse smartphone with great design and build<br>
                        a good Amoled screen, record-breaking performance, superb software,<br>
                         great battery life and an excellent price. </p>
                  <p><b>Product Cost: Rs.24,000/-</b></p>
                    <input type="button" onclick="" name="Buy Now" value="Buy Now">
                </td>
                </tr>

            <tr>
                <td>
                <img src="Documents/images.jpg" alt="OnePlus3" style="width:100%">
                <h1>One Plus 3</h1>
                  <p class="title">Product Name: One Plus 3</p>
                  <p>The OnePlus 3 is a powerhouse smartphone with great design and build<br>
                    a good Amoled screen, record-breaking performance, superb software,<br>
                     great battery life and an excellent price. </p>
               <p>Product Cost: Rs.22,000/-</p>
               <input type="button" onclick="" name="Buy Now" value="Buy Now">
              </td>
              </tr>
        </table>
        </div>

</body>
</html>