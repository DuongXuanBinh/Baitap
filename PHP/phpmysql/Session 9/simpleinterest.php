<?php
$P=$_GET['n1text'];
$R=$_GET['n2text'];
$N=$_GET['n3text'];
$SI = ($P*$R*$N)/100;
echo "The calculated simple interest is $SI";
?>
