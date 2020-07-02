function checkusername(x){
    var elMsg = document.getElementById('feedback');
    if(elusername.value.length <x){
        elMsg.textContent='Username must be 5 characters or more';
    } else {
        elMsg.textContent = '';
    }
}

var elusername = document.getElementById('username');
elusername.addEventListener("blur", function(){ checkusername(5);},false);