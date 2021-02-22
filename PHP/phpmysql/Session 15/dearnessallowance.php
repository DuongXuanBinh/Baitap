<?php
$A=$_GET['num1text'];
function DA(&$A){
    $B = .1 * $A;
    echo "<br>Your salary is $A USD";
    echo "<BR>Dearness Allowance is $B USD";
}
DA($A);
?>
