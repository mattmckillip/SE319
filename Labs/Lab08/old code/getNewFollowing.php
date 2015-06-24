<?php
session_start();
$usernameDB = "u319all";
$passwordDB = "024IjLaMj4dI";
$dbServerDB = "mysql.cs.iastate.edu"; 
$dbNameDB   = "db319all";

//connection to the database
$dbhandle = mysqli_connect($dbServerDB, $usernameDB, $passwordDB, $dbNameDB) 
  or die("Unable to connect to MySQL");

$usersResult = mysqli_query($dbhandle,"SELECT * FROM usernames") or die("Error in query: " . mysql_error());
$numResults = mysqli_num_rows($usersResult);
if ($numResults > 0){
	$returnStr = '';
	while($row = $usersResult->fetch_assoc()) {
        echo "<input type='button' id = 'followers_".$row['username']."' value='".$row['username']."' onclick=addFollowing("."'".$row['username']."');>". "<br>";
	}
	// force sending of the next chunk of data  to the client
	ob_flush();
	flush();
}
?>