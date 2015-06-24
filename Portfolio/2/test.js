
//These are the global variables
//we should figure out a way to not do this

//canvas
var canvas = document.createElement('canvas');
height = 400;
width = 600;
canvas.width = 600;
canvas.height = 400;
var canvasColor = "#222222";

//ball
var ballSpeed = 3;
var ballColor = "#FFFFF0";
var ball = new Ball(width/3, height/2);

//paddle
var paddleWidth = 10;
var paddleHeight =75;
var paddleSpeed = 4;

//instances of paddle
var player = new Player();
var computer = new Computer();

//hit detection
var personScore = 0;
var computerScore = 0;



//sets up the canvas for animation

var context = canvas.getContext('2d');

//this attaches the canvas to screen and calls the step function in the animate method
window.onload = function() {
  document.body.appendChild(canvas);
  animate(step);
};

//this updates the paddles and the balls, renders the objects, and then calls again using the requestAnimationFrame speed
var step = function() {
  update();
  render();
  animate(step);
};

//Computer AI
var update = function() {
  player.update();
  computer.update(ball);
  ball.update(player.paddle, computer.paddle);
};

//this function just renders the rectange setting color, position, and dimensions
var render = function() {
  context.fillStyle = "#FFFFFF";
  context.fillRect(0, 0, width, height);
};

//This function sets the update window at 60 calls per second
var animate = window.requestAnimationFrame ||
  window.webkitRequestAnimationFrame ||
  window.mozRequestAnimationFrame ||
  function(callback) { window.setTimeout(callback, 1000/60) };

//Adding paddles and ball
function Paddle(x, y, width, height) {
  this.x = x;
  this.y = y;
  this.width = width;
  this.height = height;
  this.x_speed = 0;
  this.y_speed = 0;
}

Paddle.prototype.render = function() {
  context.fillStyle = "#FFFFF0";
  context.fillRect(this.x, this.y, this.width, this.height);
};

//object representing player controlled paddle
function Player() {
   this.paddle = new Paddle(10, height/2, paddleWidth, paddleHeight);
}
//render paddle
Player.prototype.render = function() {
  this.paddle.render();
};

//object representing computer controlled paddle
function Computer() {
  this.paddle = new Paddle(width-20,  height/2, paddleWidth, paddleHeight);
}

//render paddle
Computer.prototype.render = function() {
  this.paddle.render();
};


//create a ball object with x and y representing the location of the center
function Ball(x, y) {
  this.x = x;
  this.y = y;
  this.x_speed = -ballSpeed;
  this.y_speed = 0;
  this.radius = 5;
}

//render the ball
Ball.prototype.render = function() {
  context.beginPath();
  //draws the circle for the ball
  context.arc(this.x, this.y, this.radius, 2 * Math.PI, false);
  context.fillStyle = ballColor;
  context.fill();
};


//build the canvas, ball, and paddles
var render = function() {
  context.fillStyle = canvasColor;
  context.fillRect(1, 1, width, height);
  player.render();
  computer.render();
  ball.render();
};


//Animation
//increment position by speed

//collision detecting
Ball.prototype.update = function(paddle1, paddle2) {
  this.x += this.x_speed;
  this.y += this.y_speed;
  var top_x = this.x - 5;
  var top_y = this.y - 5;
  var bottom_x = this.x + 5;
  var bottom_y = this.y + 5;

  if(this.y - 5 < 0) { // hitting the left wall
    this.y = 5;
    this.y_speed = -this.y_speed;
  } else if(this.y + 5 > height) { // hitting the right wall
    this.y = height-5;
    this.y_speed = -this.y_speed;
  }

  if(this.x < 0) { // a point was scored
	
	computerScore = computerScore + 1;
	document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
	
	if (computerScore <=10){
		this.x_speed = -ballSpeed;
		this.y_speed = 0;
		this.x = width/3;
		this.y = height/2;
	}
	else {
		document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
		alert("Game Over, You Lose!");
		personScore = 0;
		computerScore = 0;
		document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
		player = new Player();
		computer = new Computer();
		bball = new Ball(width/3, height/2);
	}
  }
    else if(this.x > width) { // a point was scored
	
	personScore = personScore + 1;
	document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
	
	if (personScore <10){
		this.x_speed = ballSpeed;
		this.y_speed = 0;
		this.x = width*2/3;
		this.y = height/2;
	}
	else {
		alert("Game Over, You Win!");
		personScore = 0;
		computerScore = 0;
		document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
		player = new Player();
		computer = new Computer();
		ball = new Ball(width/3, height/2);
	}
	
	
  }

  if(top_x< width/2) {
    if(top_x < (paddle1.x + paddle1.width) && bottom_x > paddle1.x && top_y < (paddle1.y + paddle1.height) && bottom_y > paddle1.y) {
      // hit the player's paddle
      this.x_speed = -1* this.x_speed;
	  //this.x_speed = 10;
	  this.y_speed += (paddle1.y_speed / 2);
      this.x += this.x_speed;
	  
    }

  } else {
	  if(top_x < (paddle2.x + paddle2.width) && bottom_x > paddle2.x && top_y < (paddle2.y + paddle2.height) && bottom_y > paddle2.y) {
      // hit the computer's paddle
      this.x_speed = -1* this.x_speed;
      this.y_speed += (paddle2.y_speed / 2);
      this.x += this.x_speed;
    }
  }
};




//Controls
var keysDown = {};

//add event listeners to grab key press
window.addEventListener("keydown", function(event) {
  keysDown[event.keyCode] = true;
});
window.addEventListener("keyup", function(event) {
  delete keysDown[event.keyCode];
});

Player.prototype.update = function() {
  for(var key in keysDown) {
    var value = Number(key);
    if(value == 38) { // left arrow
      this.paddle.move(0,-paddleSpeed);
    } else if (value == 40) { // right arrow
      this.paddle.move(0,paddleSpeed);
    } else {
      this.paddle.move(0, 0);
    }
  }
};

Paddle.prototype.move = function(x, y) {
  this.x += x;
  this.y += y;
  this.x_speed = x;
  this.y_speed = y;
  if(this.y < 0) { // all the way to the left
    this.y = 0;
    this.y_speed = 0;
  } else if (this.y + this.height > height) { // all the way to the right
    this.y = height - this.height;
    this.y_speed = 0;
  }
}



Computer.prototype.update = function(ball) {
  var y_pos = ball.y;
  var diff = -((this.paddle.y + (this.paddle.height / 2)) - y_pos);
  if(diff < 0 && diff < -4) { // max speed left
    diff = -5;
  } else if(diff > 0 && diff > 4) { // max speed right
    diff = 5;
  }
  this.paddle.move( 0,diff);
  if(this.paddle.y < 0) {
    this.paddle.y = 0;
  } else if (this.paddle.y + this.paddle.height > height) {
    this.paddle.y = height - this.paddle.height;
  }
};



//jquery stuff
$(document).ready(function()
  {
	$("button").click( function() {
		if ($(this).attr('id')=="easy"){
			ballSpeed = 3;
			paddleHeight = 75;
			paddleSpeed = 4;
			personScore = 0;
			computerScore = 0;
			document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
			player = new Player();
			computer = new Computer();
			ball = new Ball(width/3, height/2);
		}
		
		else if ($(this).attr('id')=="medium"){
			ballSpeed = 6;
			paddleHeight = 65;
			paddleSpeed = 7;
			personScore = 0;
			computerScore = 0;
			document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
			player = new Player();
			computer = new Computer();
			ball = new Ball(width/3, height/2);
		}
		
		else if ($(this).attr('id')=="hard"){
			ballSpeed = 9;
			paddleSpeed = 10;
			paddleHeight = 55;
			personScore = 0;
			computerScore = 0;
			document.getElementById("score").innerHTML = "".concat(personScore.toString()).concat(" - ").concat(computerScore.toString());
			player = new Player();
			computer = new Computer();
			ball = new Ball(width/3, height/2);
		}
		
	});
});
