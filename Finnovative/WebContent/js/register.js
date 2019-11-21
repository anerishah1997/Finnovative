function validate() { 
    var password = document.getElementById("password").value; 
    var confirmPassword = document.getElementById("confirmPassword").value;
    var annualIncome = document.getElementById("annualIncome").value; 

    
   if (password != confirmPassword) { 
     document.getElementById("confirmPasswordError").innerHTML = "Password not matched";
     return false;
    //  alert("Password not matched")
    }  
    else if(annualIncome<300000){
        doccument.getElementById("titanium").onblur;
    } 
    else{
        var form = document.getElementById("reg");
        form.action = "registerUser.do";
        form.submit();
    }
    
} 

// function cardtype(){
// var income= document.getElementById("annualIncome").value;
// var index=
// if(income<300000){
//     alert("Your annual income should be minimum of Rs.300000")
// }
// else if(income<500000)



// }