var a_score1= 90, a_score2=70;
var b_score1=70, b_score2=80;

var compr=(a_score1+a_score2) >=(b_score1+b_score2);

var el=document.getElementById('answer');
el.textContent='New high score: '+ compr;
