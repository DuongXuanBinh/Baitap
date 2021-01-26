<?php
function e(){
    echo "this is e()".'</br>';
};
function f(){
    echo "this is f()".'</br>';
    return e;
};
function g(){
    echo "this is g()".'</br>';
    return f;
};
g();
echo "***************".'</br>';
g()();
echo "***************".'</br>';
g()()();
?>
