<?php
include 'ex.php';

$a = new Employee();
$a->setName('Binh');
$a->setManNo('123');
$a->setPosition('HR');

echo $a->getManNo()."-".$a->getName()."-".$a->getPosition();

