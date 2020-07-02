var lythuyet=50;
var thuchanh=60;

var pass_lythuyet=50, pass_thuchanh=40;

var result=(lythuyet>=pass_lythuyet)&&(thuchanh>=pass_thuchanh);
var el=document.getElementById('answer');
el.textContent='Both rounds passed: '+result;