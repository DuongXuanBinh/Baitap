<?php

use App\Models\Product;
use Illuminate\Http\Request;
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

Route::get('/', function () {
    $books = Product::all();
    return view('welcome',['books'=>$books]);
});
//insert du lieu
Route::get('insert',function(){
    return view('add');
});

Route::post('add',function (Request $request){
    $product = new Product();
    $product->name = $request->name;
    $product->price = $request->price;
    $product->description = $request->description;
    $product->image = $request->image;
    $product->quantity = $request->quantity;
    $product->status = $request->status;
    $product->save();
});
