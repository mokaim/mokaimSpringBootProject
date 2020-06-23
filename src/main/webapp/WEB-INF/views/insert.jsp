<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <title></title>

  <style media="screen">

    .container-fluid {
      margin-top: 30%;
      margin-bottom: 50%;
    }

    .col-sm-12.col-lg-6.col-12 {
      margin:  auto;
    }

    body {
      background-image: url("${pageContext.request.contextPath}/static/city-1487891_1920.jpg");
    }

    .btn {
      width: 100%;
    }
    
  </style>
</head>

<body>

  <div class="container-fluid">

    <div class="row">
      <div class="col-12 col-sm-12 col-lg-6 col-12">
        <div class="card justify-content">
        
        <form action="/insertProcess" method="post">
        
          <div class="card-header">
            <div class="form-group">
              <label for="title"></label>
              <input class="form-control" type="text" name="subject" value="" id="title" placeholder="title">
            </div>
          </div>
          <div class="card-body">
            <div class="form-group">
              <textarea class="form-control" name="content" rows="10" cols="100" placeholder="Please enter your story"></textarea>
            </div>
          </div>
          <div class="card-footer text-center">
            <button type="submit" class="btn btn-primary" name="button" value="">전송</button>
          </div>
          
        </form>  
        </div>
      </div>
    </div>

  </div>

</body>

</html>
