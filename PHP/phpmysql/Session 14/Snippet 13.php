<?php
$Basic_Sal=75000;
function HRA($Basic_Sal)
{
    $HRA = 3/10 * $Basic_Sal;
    echo "Your HRA is: ";
    echo $HRA;
    echo "<br>";
}
function TA($Basic_Sal)
{
    $TA = 1/4 * $Basic_Sal;
    echo "Your TA is: ";
    echo $TA;
    echo "<br>";
}
function TAX($Basic_Sal)
{
    $TAX = 1/10*$Basic_Sal;
    echo "Your TAX is: ";
    echo $TAX;
    echo "<br>";
}
function Net_Salary($Basic_Sal){
    $A = 3/10 * $Basic_Sal;
    $B = 1/4 * $Basic_Sal;
    $C = 1/10 *$Basic_Sal;
    $Net_Sal=75000+$A+$B-$C;
    echo "Your NET salary is: ";
    echo $Net_Sal;
}
HRA($Basic_Sal);
echo "<br>";
TA($Basic_Sal);
echo "<br>";
TAX($Basic_Sal);
echo "<br>";
Net_Salary($Basic_Sal);
echo "<br>";
?>