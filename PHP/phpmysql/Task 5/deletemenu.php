<?php
require_once 'login.php';

$conn = mysqli_connect($hn,$un,$pw,$db);
if(!$conn)
    die(mysqli_connect_error());

$query = "DELETE FROM menu WHERE id = 4";
$result = mysqli_query($query);

if(!$result) die ("delete failed");

echo "deleted";
mysqli_close($conn);