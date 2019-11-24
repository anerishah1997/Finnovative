function calculateEMI()
{
	var noOfMonths = document.getElementById("noOfMonths").value;
	
	var prodPrice = document.getElementById("price").value;
	var calculatedEMI = prodPrice / noOfMonths;
	
	document.getElementById("calculatedEMI").value = calculatedEMI;
}


/*function abc(){
    $.ajax({
        url: 'pay.do?calculatedEMI='+calculatedEMI,
        success: function(data) {
          
        }
     });
}*/