<?php
require_once 'login.php';

$conn = mysqli_connect($hn,$un,$pw,$db);
if(!$conn)
    die(mysqli_connect_error());

$query = "INSERT INTO menu VALUES (4,'Cacao','M',40000,'<img src=\"8b927c77d8514d856a26b962e64d1d7f0b998cf6_2_600x600.jpeg\" height=\"250\" width=\"250\"/>')";
$result = mysqli_query($query);

if(!$result) die ("insert failed");

echo "inserted";
mysqli_close($conn);
