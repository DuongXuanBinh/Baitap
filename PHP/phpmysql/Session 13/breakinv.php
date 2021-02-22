<?php
$number = $_GET['num'];
if($number==0)
{
    exit;
}
$ans = 1/$number;
echo "<br>INverse of the entered number is 1/$number";
echo "<br><br>Its decimal equivalent is $ans";
echo "<br><br><a href='Snippet%204'>Go Back</a>";
?>
