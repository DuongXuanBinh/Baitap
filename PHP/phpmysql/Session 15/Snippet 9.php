<?php
$A = 0;
function fib($A)
{
    if($A<=1)
    {
        return $A;
    }else{
        return fib($A-1)+fib($A-2);
    }
}
while ($A !=8)
{
    $B=fib($A);
    echo "$B<br>";
    $A++;
}
?>
