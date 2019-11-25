function validate(){
    var password=document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;

    if (password != confirmPassword) { 
         document.getElementById("re-passwordError").innerHTML = "Password not matched";
        }  
    else {
        document.getElementById("re-passwordError").innerHTML = "Password matched";
    }
       
        

}