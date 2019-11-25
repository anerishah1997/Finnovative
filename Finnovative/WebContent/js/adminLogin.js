function validate() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if (username == "") {
        document.getElementById("userNameError").innerHTML = "Username should not be null";
    }
    else if (password == "") {
        document.getElementById("passwordError").innerHTML = "Password should not be null";
    }
    else {
        var form = document.getElementById("adminLogin");
        form.action = "Home.html";
        form.submit();
    }

}