<?php
session_start();
$usernameDB = "u319all";
$passwordDB = "024IjLaMj4dI";
$dbServerDB = "mysql.cs.iastate.edu"; 
$dbNameDB   = "db319all";

//connection to the database
$dbhandle = mysqli_connect($dbServerDB, $usernameDB, $passwordDB, $dbNameDB) 
  or die("Unable to connect to MySQL");

$usersResult = mysqli_query($dbhandle,"SELECT followername FROM followers WHERE username = " . "'" . $_SESSION["username"] . "'") or die("Error in query: " . mysql_error());
$numResults = mysqli_num_rows($usersResult);
if ($numResults > 0){
	while($row = $usersResult->fetch_assoc()) {
        echo $row["followername"]. "<br>";
	}
	// force sending of the next chunk of data  to the client
	ob_flush();
	flush();
}
?>
