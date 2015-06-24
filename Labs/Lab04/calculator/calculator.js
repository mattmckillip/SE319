// CALCULATOR.JS
//
//
//

// 
var Calc = {};

Calc.run = function() {
  Calc.attachHandlers();
  console.log(Calc.display());
  return Calc.display();
};

//Creating objects
Calc.textRow = {id: "textRow", type: "text", value: "", onclick:""};
Calc.button0 = {id: "button0", type: "button", value: 0, onclick:""};
Calc.button1 = {id: "button1", type: "button", value: 1, onclick:""};
Calc.button2 = {id: "button2", type: "button", value: 2, onclick:""};
Calc.button3 = {id: "button3", type: "button", value: 3, onclick:""};
Calc.button4 = {id: "button4", type: "button", value: 4, onclick:""};
Calc.button5 = {id: "button5", type: "button", value: 5, onclick:""};
Calc.button6 = {id: "button6", type: "button", value: 6, onclick:""};
Calc.button7 = {id: "button7", type: "button", value: 7, onclick:""};
Calc.button8 = {id: "button8", type: "button", value: 8, onclick:""};
Calc.button9 = {id: "button9", type: "button", value: 9, onclick:""};

Calc.buttonplus = {id: "button+", type: "button", value: '+', onclick:""};
Calc.buttonminus = {id: "button-", type: "button", value: '-', onclick:""};
Calc.buttontimes = {id: "button*", type: "button", value: '*', onclick:""};
Calc.buttondivide = {id: "button/", type: "button", value: '/', onclick:""};
Calc.buttonequals = {id: "button=", type: "button", value: '=', onclick:""};
Calc.buttondecimal = {id: "button.", type: "button", value: '.', onclick:""};
Calc.buttonC = {id: "buttonC", type: "button", value: 'C', onclick:""};
Calc.buttonMR = {id: "buttonMR", type: "button", value: 'MR', onclick:""};
Calc.buttonMC = {id: "buttonMC", type: "button", value: 'MC', onclick:""};
Calc.buttonMP = {id: "buttonM+", type: "button", value: 'M+', onclick:""};



Calc.displayElement = function (element) {
  var s = "<input ";
  s += " id=\"" + element.id + "\"";
  s += " type=\"" + element.type + "\"";
  s += " value= \"" + element.value + "\"";
  s += " onclick= \"" + element.onclick + "\"";
  s += ">";
  return s;

}

//Displaying the calculator
Calc.display = function() {
  var s;
  s = "<table id=\"myTable\" border=2>"
  s += "<tr><td>" + Calc.displayElement(Calc.textRow) + "</td></tr>";
  s += "<tr><td>";
  s += Calc.displayElement(Calc.button7);
  s += Calc.displayElement(Calc.button8);
  s += Calc.displayElement(Calc.button9);
  s += Calc.displayElement(Calc.buttonplus);
  s += "<tr><td>";
  s += Calc.displayElement(Calc.button4);
  s += Calc.displayElement(Calc.button5);
  s += Calc.displayElement(Calc.button6);
  s += Calc.displayElement(Calc.buttonminus);
  s += "<tr><td>";
  s += Calc.displayElement(Calc.button1);
  s += Calc.displayElement(Calc.button2);
  s += Calc.displayElement(Calc.button3);
  s += Calc.displayElement(Calc.buttontimes);
  s += "<tr><td>";
  s += Calc.displayElement(Calc.button0);
  s += Calc.displayElement(Calc.buttondecimal);
  s += Calc.displayElement(Calc.buttonequals);
  s += Calc.displayElement(Calc.buttondivide);
  s += "<tr><td>";
  s += Calc.displayElement(Calc.buttonC);
  s += Calc.displayElement(Calc.buttonMR);
  s += Calc.displayElement(Calc.buttonMC);
  s += Calc.displayElement(Calc.buttonMP);
  s += "</tr></td></table>";
  return s;
}

//Attaching handlers
Calc.attachHandlers = function() {
	Calc.button0.onclick = "Calc.button0Handler()"; 
	Calc.button1.onclick = "Calc.button1Handler()"; 
	Calc.button2.onclick = "Calc.button2Handler()"; 
	Calc.button3.onclick = "Calc.button3Handler()"; 
	Calc.button4.onclick = "Calc.button4Handler()"; 
	Calc.button5.onclick = "Calc.button5Handler()"; 
	Calc.button6.onclick = "Calc.button6Handler()"; 
	Calc.button7.onclick = "Calc.button7Handler()"; 
	Calc.button8.onclick = "Calc.button8Handler()"; 
	Calc.button9.onclick = "Calc.button9Handler()"; 
	
	Calc.buttonplus.onclick = "Calc.buttonplusHandler()"; 
	Calc.buttonminus.onclick = "Calc.buttonminusHandler()"; 
	Calc.buttontimes.onclick = "Calc.buttontimesHandler()"; 
	Calc.buttondecimal.onclick = "Calc.buttondecimalHandler()"; 
	Calc.buttonequals.onclick = "Calc.buttonequalsHandler()"; 
	Calc.buttondivide.onclick = "Calc.buttondivideHandler()"; 
	Calc.buttonC.onclick = "Calc.buttonCHandler()"; 
	Calc.buttonMR.onclick = "Calc.buttonMRHandler()"; 
	Calc.buttonMC.onclick = "Calc.buttonMCHandler()"; 
	Calc.buttonMP.onclick = "Calc.buttonMPHandler()"; 

}

//MEMORY

//Closure statement to hide the memory value variable
var newMem = function () {
	var memHide = "0";
	return function () {return memHide = eval(textRow.value + "+" + memHide)}
};

var mem = newMem();

//HANDLERS

//For the number buttons we added a quality of life improvement were if the screen is "0" then it replaces it
//We did this because evaluate has some strange behavior when a zero leads a number ("0123" is "83")

Calc.button7Handler = function() {  
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "7";
}

Calc.button8Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "8";
}

Calc.button9Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "9";
}

Calc.buttonplusHandler = function() {  
  textRow.value += "+";
}

Calc.button4Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "4";
}

Calc.button5Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "5";
}

Calc.button6Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "6";
}

Calc.buttonminusHandler = function() {  
  textRow.value += "-";
}

Calc.button1Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "1";
}

Calc.button2Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "2";
}

Calc.button3Handler = function() {    
  if(textRow.value == "0")textRow.value = "";
  textRow.value += "3";
}

Calc.buttontimesHandler = function() {  
  textRow.value += "*";
}

Calc.button0Handler = function() {  
  textRow.value += "0";
}

Calc.buttondecimalHandler = function() {  
  textRow.value += ".";
}

Calc.buttonequalsHandler = function() {  
  textRow.value = eval(textRow.value);
}

Calc.buttondivideHandler = function() {  
  textRow.value += "/";
}

Calc.buttonCHandler = function() {  
  textRow.value = "";
}

//To show current memory the screen is set to blank to avoid adding anything to it
Calc.buttonMRHandler = function() {
  textRow.value = "";
  textRow.value = mem();
}

//Resetting the memory requires a temp blank "screen"
Calc.buttonMCHandler = function () {
  var temp = textRow.value;
  textRow.value = "0";
  mem = newMem();
  textRow.value = temp;
}

//mem() will add the current screen value to the memory (it should also evaluate the screen if it is more than just a number
Calc.buttonMPHandler = function () {
  mem();
}