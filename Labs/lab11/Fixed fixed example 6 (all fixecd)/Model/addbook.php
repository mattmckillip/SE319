<?php
	include("library.php");
	$library = new library();
	for($i = 0; $i < $_POST['numcopies']; $i++)
	{
		$library->addBook((int)$_POST['bookid'], mysql_real_escape_string($_POST['name']), mysql_real_escape_string($_POST['author']));
	}

	header("Location: ../View/librarian_home.php");
?>
