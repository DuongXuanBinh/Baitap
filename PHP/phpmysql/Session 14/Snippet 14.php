<?php
$A = 10;
function factorial($A){
    if($A<=1){
        return 1;
    }
    else{
        return $A * factorial($A-1);
    }
}
echo "The factorial of $A is: ";
$B = factorial($A);
echo $B;
?>