function calculateEMI()
{
	var noOfMonths = document.getElementById("noOfMonths").value;
	
	var prodPrice = document.getElementById("price").value;
	var calculatedEMI = prodPrice / noOfMonths;
	
	document.getElementById("calculatedEMI").value = calculatedEMI.toFixed();
}

function Validate()
{
	var calculatedEMI = document.getElementById("calculatedEMI");
	if(calculatedEMI=='')
		alert("Please select any month");
}