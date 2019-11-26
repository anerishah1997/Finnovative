function Validate() { 
    var password = document.getElementById("password").value; 
    var confirmPassword = document.getElementById("confirmPassword").value;
    var annualIncome = document.getElementById("annualIncome").value; 

     if (password != confirmPassword) { 
     document.getElementById("confirmPasswordError").innerHTML = "Password not matched";
     document.getElementById("passwordError").innerHTML = "";
     document.getElementById("register").disabled= true;
    }  
    else if(password == confirmPassword){
        // document.getElementById("passwordError").innerHTML = "Password matched";
        document.getElementById("confirmPasswordError").innerHTML = "";
        document.getElementById("register").disabled= false;
     }
    
}

function MobileNumber() {
        var mob = /^[1-9]{1}[0-9]{9}$/;
        var txtMobile = document.getElementById("mobileNumber");
        
        if (mob.test(txtMobile.value) == false) {
            document.getElementById("mobileNumberError").innerHTML = "Enter correct mobile number";
            document.getElementById("register").disabled= true;
            }
        else if(mob.test(txtMobile.value) == true){
            document.getElementById("register").disabled= false;
            document.getElementById("mobileNumberError").innerHTML = "";


        }
        
    }
function AnnualIncome(){
    var income = document.getElementById("annualIncome").value;
    document.getElementById("titanium").disabled=true;
    if(income<300000){
    	
        document.getElementById("titanium").disabled=true;
        document.getElementById("annualIncomeError").innerHTML = "Not eligible for titanium card";
    }
    else if(income>300000){
        document.getElementById("titanium").disabled=false;
        document.getElementById("annualIncomeError").innerHTML = "";
    }
}

function AlertUser()
{
	alert("Registration Succesful!!! Your details are under verification.Login once you recieve confirmation mail");
}
