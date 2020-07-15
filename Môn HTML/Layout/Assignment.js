var randomNum1, randomNum2, randomNum3;
var el;
var current = 0;
var best = 0;
var click = 0;
var img=new Array()
img[0]='<img src="../Layout/img/space.svg" alt="">'
img[1]='<img src="../Layout/img/beach.svg" alt="">'
img[2]='<img src="../Layout/img/robot.svg" alt="">'

$(document).ready(function () {
    while(randomNum1===randomNum2||randomNum2===randomNum3||randomNum3===randomNum1){
        randomNum1 = Math.floor(Math.random() * 3);
        randomNum2 = Math.floor(Math.random() * 3);
        randomNum3 = Math.floor(Math.random() * 3);
    }
    $('#div1').click(function(){
        click+=1;
        document.getElementById('div1').innerHTML=img[randomNum1];
        if (randomNum1===2 && click <3){
            el=document.getElementById('reset');
            el.textContent='Game over! Play again?';
            current=0;
            document.getElementById('Current').textContent=current;
        }
        else if(randomNum1===2&& click===3){
            el=document.getElementById('reset');
            el.textContent='You win';
            best +=1;
            current+=1;
            document.getElementById('Current').textContent=current;
            document.getElementById('Best').textContent=best;
        }
    });
    $('#div2').click(function(){
        click+=1;
        document.getElementById('div2').innerHTML=img[randomNum2];
        if (randomNum2===2 && click <3){
            el=document.getElementById('reset');
            el.textContent='Game over! Play again?';
            current=0;
            document.getElementById('Current').textContent=current;
        }
        else if(randomNum2===2&& click===3){
            el=document.getElementById('reset');
            el.textContent='You win';
            best +=1;
            current+=1;
            document.getElementById('Current').textContent=current;
            document.getElementById('Best').textContent=best;
    }});
    $('#div3').click(function(){
        click+=1;
        document.getElementById('div3').innerHTML=img[randomNum3];
        if (randomNum3===2 && click <3){
            el=document.getElementById('reset');
            el.textContent='Game over! Play again?';
            current=0;
            document.getElementById('Current').textContent= current;
        }
        else if(randomNum3===2&& click===3){
            el=document.getElementById('reset');
            el.textContent='You win';
            best +=1;
            current+=1;
            document.getElementById('Current').textContent=current;
            document.getElementById('Best').textContent=best;
    }});
    $('#reset').click(function () {
        document.getElementById('div1').innerHTML='<img src="../Layout/img/closed_door.svg" alt="">'
        document.getElementById('div2').innerHTML='<img src="../Layout/img/closed_door.svg" alt="">'
        document.getElementById('div3').innerHTML='<img src="../Layout/img/closed_door.svg" alt="">'
        document.getElementById('reset').innerHTML='Good luck!';
        click = 0;
        do{
            randomNum1 = Math.floor(Math.random() * 3);
            randomNum2 = Math.floor(Math.random() * 3);
            randomNum3 = Math.floor(Math.random() * 3);
        }while(randomNum1===randomNum2||randomNum2===randomNum3||randomNum3===randomNum1);
    })
})


