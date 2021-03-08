<?php
require_once 'login.php';

$conn = mysqli_connect($hn,$un,$pw,$db);
$query = "Insert into student(name,age,address,telephone) values ('Nguyen Thi Hang',26,'Bac Giang','0932555666')";

$result = mysqli_query($conn,$query);
if(!$result) die ("insert failed");

echo "Inserted successfully";

mysqli_close($conn);
?>
