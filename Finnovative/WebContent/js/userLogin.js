function validate(){
    //alert("Inside Validate");
    var username=document.getElementById("userName").value;
    var password = document.getElementById("userPassword").value;
    if(username==""){
        document.getElementById("userNameError").innerHTML = "Username should not be null";
    }

    else if(password=="")
    {
        document.getElementById("passwordError").innerHTML = "Password should not be null";
    }
    else{
        var form = document.getElementById("frm");
        form.action = "Home.html";
        form.submit();
    }

}