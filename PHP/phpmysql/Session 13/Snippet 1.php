<?php
$fib1 = 0;
$fib2= 0;
$sum = 0;
echo "The Fibonacci series: <br><br>";
echo "$fib1<br>";
while ($sum<=15)
{
    echo "$fib2<Br>";
    $sum=$fib1+$fib2;
    $fib1 = $fib2;
    $fib2 = $sum;
}
echo "<br>";
return 0;
?>
