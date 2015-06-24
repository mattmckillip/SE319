<?php
session_start();
$usernameDB = "u319all";
$passwordDB = "024IjLaMj4dI";
$dbServerDB = "mysql.cs.iastate.edu"; 
$dbNameDB   = "db319all";
$_SESSION["successfullFollow"] = 0;
//connection to the database
$dbhandle = mysqli_connect($dbServerDB, $usernameDB, $passwordDB, $dbNameDB) 
  or die("Unable to connect to MySQL");

$sql = "INSERT INTO followers (username, followername)  VALUES ('" . $_REQUEST["userToFollow"] . "','" . $_REQUEST["username"] . "')";
if (mysqli_query($dbhandle, $sql)) {
	$_SESSION["successfullFollow"] = 1;
    header("location: /mainpage.html");
} else {
	$_SESSION["successfullFollow"] = 2;
    header("location: /mainpage.html");
}
?>