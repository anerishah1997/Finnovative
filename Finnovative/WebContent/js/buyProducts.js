function calculateEMI()
{
	var noOfMonths = document.getElementById("noOfMonths").value;
	
	var prodPrice = document.getElementById("price").value;
	var calculatedEMI = prodPrice / noOfMonths;
	
	document.getElementById("calculatedEMI").innerHTML = calculatedEMI;
}