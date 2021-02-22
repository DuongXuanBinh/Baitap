<?php
date_default_timezone_get('Asia/Calcutta');
echo "Today is: ".date("1");
$Today_Date = getdate();
$current_month = $Today_Date['month'];
echo "<br>";
echo "Current month is: ";
echo $current_month;
?>
