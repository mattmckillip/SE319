<!DOCTYPE HTML> 
<html>
<head>
<style>
.error {color: #FF0000;}
</style>
</head>
<body> 

<?php
session_start();
$usernameDB = "u319all";
$passwordDB = "024IjLaMj4dI";
$dbServerDB = "mysql.cs.iastate.edu"; 
$dbNameDB   = "db319all";

//connection to the database
$dbhandle = mysqli_connect($dbServerDB, $usernameDB, $passwordDB, $dbNameDB) 
  or die("Unable to connect to MySQL");
// define variables and set to empty values
$usernameErr = "";
$username = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
	$isValid = true;
   if (empty($_POST["username"])) {
     $usernameErr = "Username is required";
	 $isValid = false;
   } else {
     $username = test_input($_POST["username"]);
     // check if username only contains letters and numbers
     if (!preg_match("/^\w+$/",$username)) {
       $usernameErr = "Only letters and numbers allowed";
		$isValid = false;
     }
   }
   
   if ($isValid){
		$isMatch = false;
		//If username and password match users, set session username advance to student/library page
		$usersResult = mysqli_query($dbhandle,"SELECT * FROM usernames WHERE username = " . "'" . $username . "'") or die("Error in query: " . mysql_error());
		$numResults = mysqli_num_rows($usersResult);
		if ($numResults > 0){
			$_SESSION["username"] = $username;
			header("Location: /mainpage.php");
		}
		else{
			//not a current user so add user to table
			$sql = "INSERT INTO usernames (username) VALUES ('" . $username . "')";
			
			//check if the insert workds
			if ($dbhandle->query($sql) === TRUE) {
				//user must follow themselves
				$sql2 = "INSERT INTO followers (username, followername) VALUES ('" . $username . "','" . $username . "')";
				
				//check if the insert works
				if ($dbhandle->query($sql2) === TRUE) {
					//user must follow themselves
					header("Location: /mainpage.php");
				} 
				else {
					//show error for debugging
					echo "Error: " . $sql2 . "<br>" . $conn->error;
				}
			} 
			else {
				//show error for debugging
				echo "Error: " . $sql . "<br>" . $conn->error;
			}		
		}
   }
}

function test_input($data) {
   $data = trim($data);
   $data = stripslashes($data);
   $data = htmlspecialchars($data);
   return $data;
}
?>

<h2>Login to 319 twitter</h2>
<p><span class="error">* required field.</span></p>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>"> 
<fieldset>
<legend><b>Log In</b></legend>
   Username: <input type="text" name="username" value="<?php echo $username;?>">
   <span class="error">* <?php echo $usernameErr;?></span>
   <br><br>
   <input type="submit" name="submit" value="Log In">
</fieldset>
</form>

</body>
</html>