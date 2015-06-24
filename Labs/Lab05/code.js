$(document).ready(function()
  {
	//Events
	//hide text that is dblclicked
	$("p").dblclick( function() {
		$(this).hide();
	});
		 
	//display alert showing the button pushed
	$("button").click(function() {alert($(this).attr('id'));})
		
	//change text to blue when clicked one
	$("p").click( function() {
        $(this).css("color","blue").show()
	});
	
	//when the mouse enters the window
	$(this).mouseenter(function() {alert("entring window")})
	
	//when keyboard is pressed
	$(this).keydown(function() {alert("keydown")})
	
	//when mouse leaves
	$(this).mouseleave(function() {alert("mouse left")})
	
	//when form loads
	$(this).resize(function() {alert("resizing")})
	
	//button click to drive styles and events
     $("button").click( function() {
		//Styles
		//default text style
		if ($(this).attr('id')=="b1"){
		    $("p").css("color","black");
			$("p").css("background-color","white");
			$("p").css("text-align","left");
			$("p").css("font-size","16");
			$("p").css("borer-color","white");
			$("p").css("line-height", "1");
			$("p").css("word-spacing", "1");
			$("p").animate({
				left: [ "+=50", "swing" ],
				opacity: [ 1, "linear" ]
			}, 300 );
		}
	
		//change backround to red
		else if ($(this).attr('id')=="b2"){
		    $("p").css("background-color","red");
		}
		
		//change text align to center
		else if ($(this).attr('id')=="b3"){
		    $("p").css("text-align","center");
		}
		
		//change font size to 40
		else if ($(this).attr('id')=="b4"){
		    $("p").css("font-size","40");
		}
		
		//increase line height to 5
		else if ($(this).attr('id')=="b5"){
		    $("p").css("line-height", "5");
		}
		
		//increase word spacing to 10
		else if ($(this).attr('id')=="b6"){
		    $("p").css("word-spacing", "10");
		}
		
		//Effects
		//slow hide
		else if ($(this).attr('id')=="b7"){
		    $("p").hide( "slow" );
		}
		
		//fade out
		else if ($(this).attr('id')=="b8"){
		    $("p").fadeOut( 1500 );
			
		}
		
		//fade int
		else if ($(this).attr('id')=="b9"){
		   $("p").fadeIn(750);
		}
		
		//custom fade to 25% opacity
		else if ($(this).attr('id')=="b10"){
		    $( "p" ).animate({
				left: [ "+=50", "swing" ],
				opacity: [ 0.25, "linear" ]
			}, 300 );
		}
		
		//fade toggle
		else if ($(this).attr('id')=="b11"){
		    $("p").fadeToggle( 400 );
		}	
       });
  }); // end of read