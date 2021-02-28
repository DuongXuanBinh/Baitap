<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/
use App\Models\Task;
use Illuminate\Http\Request;
//Route::get('/', function () {
//    return view('welcome');
//});
//show task dashboard
Route::get('/',function (){

});

Route::post('/task/{task}',function(){

});
