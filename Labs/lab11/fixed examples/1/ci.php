<?php
print("Please specify the name of the file to delete");
print("<p>");
//$modes  =  array("rm");  if(!in_array($_GET["filename"],  $modes)) exit ;
htmlentities($_GET['filename'],  ENT_QUOTES,  "utf-8") 
system("rm $file");
?>