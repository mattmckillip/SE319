<?php
session_start();
$usernameDB = "u319all";
$passwordDB = "024IjLaMj4dI";
$dbServerDB = "mysql.cs.iastate.edu"; 
$dbNameDB   = "db319all";
$_SESSION["successfullPost"] = false;
//connection to the database
$dbhandle = mysqli_connect($dbServerDB, $usernameDB, $passwordDB, $dbNameDB) 
  or die("Unable to connect to MySQL");

//get timestamp
date_default_timezone_set ( 'America/Chicago' );

$sql = "INSERT INTO message (username, msg, posttime)  VALUES ('" . $_REQUEST["username"] . "','" . $_REQUEST["message"] . "',CURRENT_TIMESTAMP)";
if (mysqli_query($dbhandle, $sql)) {
	$_SESSION["successfullPost"] = true;
    header("location: /mainpage.html");
} else {
	$_SESSION["successfullPost"] = false;
    header("location: /mainpage.html");
}
?>