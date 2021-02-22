<?php
function Square(&$A){
    $A = $A*$A;
    echo $A;
}
$A = 5;
echo "The square of $A is: ";
Square($A);
function multiplication(&$A,&$B){
    $C = $A * $B;

    echo "<br><br>The multiplication of $A and $B is: $C";
}
$A = 25;
$B = 30;
multiplication($A,$B);
?>