<?php
$A = $_GET['n1text'];
function cube($A)
{
    $cube = $A*$A*$A;
    return $cube;
}
$B = cube($A);
echo "The cube of $A is";
echo $B;
?>
