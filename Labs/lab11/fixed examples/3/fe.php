<?php
//create a whitelist of acceptable filenames
$colors  =  array("red.php",  "blue.php");

//check that it is in the whitelist
if(in_array(basename($_GET['COLOR']) . '.php',  $colors)){
	include( './includes/.'.basename($_GET['COLOR']) . '.php' );
}
?>