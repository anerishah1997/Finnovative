<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
   <link rel="stylesheet" href="css/register.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway&display=swap" rel="stylesheet">
    <script src="js/register.js"></script>
</head>
<body>
<div class="full-height" id="gradstretch">
<header>
    <div><img src="images/logo.png" alt="logo" width="8%"></div>
    <div class="navbar">
    <a href="indexPage"> Home</a>
    <a href="registerPage"> Register</a>
    
  </div> 
  </header> 
<table  align="center"  style="margin-left:auto;margin-right:auto;margin-top:2%;margin-bottom:0%;">
<tr><td>
        <h2 align="center"><b><i>Registration Page</i></b></h2>  
<form  action="registerUser.do" method="post" id="reg" name="name">

<table align="center" >
    <tr>
        
        <td>Full Name:</td>
        <td><input type ="text" name="fullName" id="fullName" placeholder="Enter name" required/></td>
       
    </tr>
    <tr>
        <td><label>Mobile No:</label></td>
        <td><input type="text" name="PhoneNo" id="PhoneNo" placeholder="Enter mobile number" onkeyup='MobileNumber();' required></td>
        <tr colspan="2"><td></td><td   style="text-align: right; color:red; font-style:italic" id="mobileNumberError"></td> </tr>
    </tr>
    <tr>
            <td><label>Email:</label></td>
            <td><input type="email" name="Email" id="Email" placeholder="Enter email address" required></td>
            <td id="emailError"></td> 
    </tr>

    <tr>
            <td><label>Username:</label></td>
            <td><input type="text" name="Username" id="username" placeholder="Enter username" required></td>
            <td id="userNameError"></td> 
     </tr>

     <tr>
            <td><label>Password:</label></td>
             <td><input type="password" name="Password" id="password" placeholder="Enter password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 7 or more characters" required></td>
             <td id="passwordError"></td> 
    </tr>
    
    <tr>
           <td><label>Confirm Password:</label></td>
           <td><input type="password" name="ConfirmPassword" id="confirmPassword" placeholder="Enter password" onkeyup='Validate();' required></td>
          <tr colspan="2"><td></td><td   style="text-align: right; color:red; font-style:italic" id="confirmPasswordError"></td> </tr>
            <tr colspan="2"><td></td><td   style="text-align: right; color:green; font-style:italic" id="passwordError"></td> </tr> 
     </tr>
     <tr>
            <td><label>Address:</label></td>
            <td><input type="text" name="Address" id="address" placeholder="Enter address" required></td>
            <td id="addressError"></td> 
    </tr>
    <tr>
        <td><label>Annual Income:</label></td>
         <td><input type="number" name="income" id="annualIncome" placeholder="Enter annual Income" onkeyup="AnnualIncome();" required></td>
         <tr colspan="2"><td></td><td   style="text-align: right; color:blue; font-style:italic" id="annualIncomeError"></td> </tr>
    </tr>
    <tr>
        <th>Card Type</th>
        <td>
        <input type="radio" name="Card" id="gold" value="Gold" >Gold
        <input type="radio" name="Card" id="titanium" value="Titanium"  onkeyup="AnnualIncome();">Titanium
        </td>
        <td id="cardTypeError"></td> 
    </tr>
    <tr>
        <th>Select Bank</th>
        <td>
            <select name="Bank" id="bank">
                <option selected="" value="Default">(Please select a Bank)</option>
                <option value="HDFC">HDFC</option>
                <option value="Standard Chartered">Standard Chartered</option>
                <option value="IDBI">IDBI</option>
                <option value="ICIC">ICICI</option>
                <option value="HSBC">HSBC</option>
            </select>

        </td>
        <td id="bankError"></td> 
         </tr>
        <tr>
            <td><label>Account Number</label></td>
            <td><input type="number" name="AccountNumber" id="accountNumber" placeholder="Enter account number" required></td>
            <td id="accountNumberError"></td> 
        </tr>
         <tr>
             <td><label>IFSC code:</label></td>
              <td><input type="text" name="IFSCcode" id="ifscCode" placeholder="Enter IFSC code" required></td>
               <td id="ifscError"></td> 
       </tr>
        <tr>
            <td>Upload Aadhar Card: <input type="file" name="aadhar"></td> 
		
       </tr>
       <!-- <tr>
            <td>File to upload: <input type="file" name="file"></td> 
			<td>Enter username to upload file: <input type="text" name="name"></td>
			<td><input type="submit" value="Upload"></td>
       </tr> -->
      <tr>
         <td colspan="2" align="center"><input type="submit" value="Register" onclick="validate()"/></td>
      </tr>
   
</table>
</form>
</td>
</tr>
</table>
<footer class="footer"> 
        <p align="center">©Copyright Finnovative Financial Services</p>
</footer>
</div>
</body>
</html>