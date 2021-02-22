<?php
$A = $_GET['num1text'];
$B = $_GET['num2text'];
function multiply($A,$B)
{
    $C = $A*$B;
    echo "The multiplication of $A and $B: $C";
}
multiply($A,$B);
?>
