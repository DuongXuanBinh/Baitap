var lythuyet=70,thuchanh=40;
var pass_lythuyet=50,pass_thuchanh=50;

var result=(lythuyet>=pass_lythuyet)||(thuchanh>=pass_thuchanh);

var el=document.getElementById('answer');
el.textContent= "Resit required: " + (!result)