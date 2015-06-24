<!DOCTYPE html>
<html>
	<head>
	<?php session_start();
		$username = $_SESSION['username'];
	?>
		<style>
		#header {
			background-color:black;
			color:white;
			text-align:center;
			padding:5px;
		}
		#followers_header {
			line-height:30px;
			background-color:#eeeeee;
			height:500px;
			width:100px;
			float:left;
			padding:5px;	      
		}
		#followers {
			position: absolute;
			top: 200px;
			line-height:30px;
			background-color:#eeeeee;
			height:500px;
			width:100px;
			float:left;
			padding:5px;	      
		}
		#following_header {
			line-height:30px;
			background-color:#eeeeee;
			height:500px;
			width:100px;
			float:right;
			padding:5px;	      
		}
		#following {
			position: absolute;
			top: 200px;
			left: 94%;
			line-height:30px;
			background-color:#eeeeee;
			height:500px;
			width:5.5%;	      
		}
		
		#following_posts {
			width:350px;
			float:left;
			padding:10px;      
		}
		#section {
			width:350px;
			float:left;
			padding:10px;	 	 
		}
		#footer {
			background-color:black;
			color:white;
			clear:both;
			text-align:center;
		   padding:5px;	 	 
		}
		</style>
	</head>

	<body>
		<div id="header">
			<h1>User <?php echo $username ?>'s 319 twitter page</h1>
		</div>
		<div id="followers_header">
			<h2>Followers</h2>
		</div>
		<div id="following_header">
			<h2>Following</h2>
			<input type="button" id = "followers_button" value="Follow Someone"/>
		</div>
		<div id="followers"></div>
		<div id="following"></div>
		<div id="section">
			Post Message: <input type="text" id="messageid">
			<input type="button" id = "submit_button" value="Submit"/>
		</div>
		<br>
		<br>
		<h2>Posts</h2>
		<div id="following_posts"></div>

		<script>
			getFollowers();
			getFollowing();
			getFollowingPosts();
			var btn1 = document.getElementById("submit_button");
			btn1.onclick =  makePost;
			var btn2 = document.getElementById("followers_button");
			btn2.onclick = followSomeone;
			
			function getFollowers() {
				// 1. CREATE XHR object
				var xhr = new XMLHttpRequest();

				// 2. SET UP CALLBACKS
				xhr.onreadystatechange = function() {

					// READY STATE == 3 MEANS THAT SOME RESPONSE CAME BACK
					// NOTE THAT THE ENTIRE RESPONSE RECEIVED SO FAR IS IN responseText
					if(xhr.readyState == 3) {
						document.getElementById("followers").innerHTML =  xhr.responseText;
					}

					// READY STATE == 4 MEANS THAT ALL RESPONSE HAS COME BACK
					// NOTE THAT THE ENTIRE RESPONSE IS IN XHR.
					else if (xhr.readyState == 4) {
						document.getElementById("followers").innerHTML =  xhr.responseText;
					}
				};

				// 3. SET UP REQUEST
				xhr.open("get","getFollowers.php",true); 

				// 4. SEND REQUEST
				xhr.send(null);
			};

			function getFollowing() {
			  // 1. CREATE XHR object
			  var xhr = new XMLHttpRequest();

			  // 2. SET UP CALLBACKS
			  xhr.onreadystatechange = function() {

				// READY STATE == 3 MEANS THAT SOME RESPONSE CAME BACK
				// NOTE THAT THE ENTIRE RESPONSE RECEIVED SO FAR IS IN responseText
				if(xhr.readyState == 3) {
				  document.getElementById("following").innerHTML =  xhr.responseText;
				}

				// READY STATE == 4 MEANS THAT ALL RESPONSE HAS COME BACK
				// NOTE THAT THE ENTIRE RESPONSE IS IN XHR.
				else if (xhr.readyState == 4) {
				  document.getElementById("following").innerHTML =  xhr.responseText;
				}
			  };

			  // 3. SET UP REQUEST
			  xhr.open("get","getFollowing.php",true); 

			  // 4. SEND REQUEST
			  xhr.send(null);
			};

			function getFollowingPosts() {
			  // 1. CREATE XHR object
			  var xhr = new XMLHttpRequest();

			  // 2. SET UP CALLBACKS
			  xhr.onreadystatechange = function() {

				// READY STATE == 3 MEANS THAT SOME RESPONSE CAME BACK
				// NOTE THAT THE ENTIRE RESPONSE RECEIVED SO FAR IS IN responseText
				if(xhr.readyState == 3) {
				  document.getElementById("following_posts").innerHTML =  xhr.responseText;
				}

				// READY STATE == 4 MEANS THAT ALL RESPONSE HAS COME BACK
				// NOTE THAT THE ENTIRE RESPONSE IS IN XHR.
				else if (xhr.readyState == 4) {
				  document.getElementById("following_posts").innerHTML =  xhr.responseText;
				}
			  };

			  // 3. SET UP REQUEST
			  xhr.open("get","getFollowingPosts.php",true); 

			  // 4. SEND REQUEST
			  xhr.send(null);
			}

			function makePost() {
			  // 1. CREATE XHR object
			  var xhr = new XMLHttpRequest();

			  // 3. SET UP REQUEST USING POST
			  xhr.open("post","makepost.php",true); 

			  xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");


			  // 4. SEND REQUEST
			  // NOTE HOW WE SEND DATA HERE

				xhr.send("username=".concat("<?php echo $username ?>").concat("&message=").concat(document.getElementById('messageid').value));
				location.reload();
			}
			
			function followSomeone() {
				// 1. CREATE XHR object
				var xhr = new XMLHttpRequest();

				// 2. SET UP CALLBACKS
				xhr.onreadystatechange = function() {

					// READY STATE == 3 MEANS THAT SOME RESPONSE CAME BACK
					// NOTE THAT THE ENTIRE RESPONSE RECEIVED SO FAR IS IN responseText
					if(xhr.readyState == 3) {
					  document.getElementById("following").innerHTML =  xhr.responseText;
					}

					// READY STATE == 4 MEANS THAT ALL RESPONSE HAS COME BACK
					// NOTE THAT THE ENTIRE RESPONSE IS IN XHR.
					else if (xhr.readyState == 4) {
					  document.getElementById("following").innerHTML =  xhr.responseText;
					}
				};

				  // 3. SET UP REQUEST
				  xhr.open("get","getNewFollowing.php",true); 

				  // 4. SEND REQUEST
				  xhr.send(null);
			}
			
			function addFollowing(userToFollow){
				// 1. CREATE XHR object
				var xhr = new XMLHttpRequest();

				// 3. SET UP REQUEST USING POST
				xhr.open("post","addNewFollowing.php",true); 

				xhr.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded");


				// 4. SEND REQUEST
				// NOTE HOW WE SEND DATA HERE
				var sendStr = "username=".concat("<?php echo $username ?>").concat("&userToFollow=").concat(userToFollow)
				xhr.send(sendStr);
				location.reload();
			}

		</script>
	</body>
</html>
