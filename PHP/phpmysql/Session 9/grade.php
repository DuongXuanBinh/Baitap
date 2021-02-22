<?php
$A = $_GET['NAME'];
if($A>60)
{
    echo "Congrats! ";
    echo "You have got Grade 1";
}
else if($A<60 AND $A>40){
    echo "Congrat! ";
    echo "You have got Grade 2";
}
else
{
    echo "Sorry. You have failed.";
}
?>
