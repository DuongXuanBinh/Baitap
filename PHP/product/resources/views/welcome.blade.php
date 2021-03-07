<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="{{URL::asset('css/bootstrap.min.css')}}">

</head>
<body>
<div>
    <h2>Welcome to Book Store</h2>
</div>
<button><a href="{{url('insert')}}">Add new item</a></button>
<button>Find item</button>
@if(count($books)>0)
    <table class="table">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Description</th>
            <th scope="col">Image</th>
            <th scope="col">Quantity</th>
            <th scope="col">Status</th>
        </tr>
        </thead>
        @foreach($books as $book )
        <tbody>
        <tr>
            <th scope="row">{{$book->id}}</th>
            <td>{{$book->name}}</td>
            <td>{{$book->price}}</td>
            <td>{{$book->description}}</td>
            <td><image href="URL::asset{{"images/$book->image"}}"></image></td>
            <td>{{$book->quantity}}</td>
            <td>{{$book->status}}</td>
        </tr>
        </tbody>
        @endforeach
    </table>
@else
    <div>
        <h4>No book to show</h4>
    </div>
    @endif
</body>
</html>
