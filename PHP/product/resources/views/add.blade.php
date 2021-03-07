<?php
    ?>
    <!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="{{URL::asset('css/bootstrap.min.css')}}">

</head>
<body>
<div>
    <form action="{{url('add')}}" method="post">
        @csrf
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">Name</span>
            <input type="text" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="name">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">Price</span>
            <input type="text" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="price">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">Image</span>
            <input type="text" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="image">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">Description</span>
            <input type="text" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="description">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">Quantity</span>
            <input type="text" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="quantity">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text" id="basic-addon1">Status</span>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="status" id="flexRadioDefault1" value="available">
            <label class="form-check-label" for="flexRadioDefault1">Available
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="status" id="flexRadioDefault3" value="available soon">
            <label class="form-check-label" for="flexRadioDefault3">
                Available soon
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="status" id="flexRadioDefault2" value="out of stock">
            <label class="form-check-label" for="flexRadioDefault2">
                Out of stock
            </label>
        </div>
        <button type="submit">ADD</button>
    </form>
</div>
</body>
</html>

