<?php
?>
<!doctype html>
<html>
<body>
<div class="container">
    <div class="content">
        <div class="content">
            <div class="title">Be right back</div>
            @if(count($errors)>0)
                <div class="alert alert-danger">
                    <strong>Ahihi! co loi roi</strong>
                    <br><br>
                    <ul>
                        @foreach($errors ->all() as $error)
                            <li>{{$error}}</li>
                        @endforeach
                    </ul>
                </div>
                @endif
        </div>
    </div>
</div>
</body>
</html>
