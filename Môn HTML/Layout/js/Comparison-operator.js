/*var point = 7;
var pass = 5;

if(point>=pass)
    {var el1=document.getElementById('answer');
    el1.textContent="Passed";}
else
    {el1=document.getElementById('answer');
    el1.textContent="Failed";}*/
var pass = 50;
var score = 90;

var hasPassed = score>=pass;

var el=document.getElementById('answer');
el.textContent='Level passed: ' + hasPassed;