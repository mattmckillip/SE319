function validateText() {
    var customer_name = document.getElementById('custname').value;
	var customer_gender = document.getElementById('gender').value;
	var customer_address = document.getElementById('address').value;
	var customer_email = document.getElementById('email').value;
	var customer_phone = document.getElementById('phone').value;
	
    if (customer_name != "") {
		var letters = /^\w+$/;  
	
		if(!customer_name.match(letters))  
		{  
			alert('Please input alphanumeric characters only');  
			return false;			
		} 
	}
	else{
		alert("Name must be filled out");
		return false;
	}
		
	if (!(((customer_gender == "Male") ||(customer_gender == "Female"))||((customer_gender == "male") ||(customer_gender == "female")))){
		alert("Gender must be filled out");
		return false;
	}
	
	
	if (customer_address == ""){
		alert("Address must be filled out");
		return false;
	}
		//TODO
	if (customer_phone != "") {

		//Used http://www.w3resource.com/javascript/form/phone-no-validation.php
		//for assistance for writing phone verification code
		var numbers = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;

		

		if(!customer_phone.match(numbers))  
		{  
			alert('Please input phone number');  
			return false;			
		} 
		
	}
	else{
		alert("Phone Number must be filled out");
		return false;
	}
	
	//TODO
	if (customer_email != "") {
		var lastAtPos = customer_email.lastIndexOf("@");
		var lastDotPos = customer_email.lastIndexOf(".");
		

		if (!(lastAtPos < lastDotPos && lastAtPos > 0 
			&& str.indexOf("@") == -1 && lastDotPos > 2 
			&& (str.length - lastDotPos) > 2))
		{
			alert('Please enter a valid email');
			return false;
		}
		
	}
	else{
		alert("Email must be filled out");
		return false;
	}
	
	//TODO
	if (customer_phone != "") {

		var numbers = /^d{3}-\d{3}-\d{4}/;
		var numbers1 = /^d{10}/;
		

		if(!customer_phone.match(numbers) || !customer_phone.match(numbers1))  
		{  
			alert('Please input phone number');  
			return false;			
		} 
		
		
	}
	else{
		alert("Phone Number must be filled out");
		return false;
	}
	
}