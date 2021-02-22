<?php
function Square($A){
    $A = $A * $A;
    echo $A;
}
$A = 5;
echo "The square of A is: ";
Square($A);

function subtraction ($A,$B){
    $C = $A - $B;
    echo "<br>The difference of $A and $B is: $C";
}
subtraction(90,45);
?>
