<?php
session_start();
$usernameDB = "u319all";
$passwordDB = "024IjLaMj4dI";
$dbServerDB = "mysql.cs.iastate.edu"; 
$dbNameDB   = "db319all";

//connection to the database
$dbhandle = mysqli_connect($dbServerDB, $usernameDB, $passwordDB, $dbNameDB) 
  or die("Unable to connect to MySQL");

//get following list
$followingList = array();
$usersResult = mysqli_query($dbhandle,"SELECT username FROM followers WHERE followername = " . "'" . $_SESSION["username"] . "'") ;
$numResults = mysqli_num_rows($usersResult);
if ($numResults > 0){
	while($row = $usersResult->fetch_assoc()) {
        array_push($followingList, $row["username"]);
	}
}	


//get following posts and sort
$post_list = array();
foreach($followingList as $user){
	$usersResult = mysqli_query($dbhandle,"SELECT msg, posttime FROM message WHERE username = " . "'" . $user . "'") ;
	$numResults = mysqli_num_rows($usersResult);
	if ($numResults > 0){
		while($row = $usersResult->fetch_assoc()) {
			$post = array();
			$post["username"] = $user;
			$post["msg"] = $row["msg"];
			$post["posttime"] = $row["posttime"];
			array_push($post_list, $post);
		}
	}

}
usort($post_list, "compare_func");

foreach($post_list as $post){
	echo $post["username"] . ":	" . $post["msg"] . "<br>posted on:	" . $post["posttime"] . "<br><br><br>";
}


// force sending of the next chunk of data  to the client
ob_flush();
flush();


function compare_func($a, $b)
{
	date_default_timezone_set ( 'America/Chicago' );
    // CONVERT $a AND $b to DATE AND TIME using strtotime() function
    $t1 = strtotime($a["posttime"]);
    $t2 = strtotime($b["posttime"]);

    return ($t2 - $t1);
}

?>
