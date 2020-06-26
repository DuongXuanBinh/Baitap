var today = new Date();

var year = today.getFullYear(); //code sot lai :)

var est = new Date('Apr 13, 1996 15:45:55');

var difference = today.getTime()- est.getTime();

difference= (difference/31556900000);

var elMsg = document.getElementById('message');
elMsg.textContent = Math.floor(difference)+'years of online travel advice';

