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
  </head>
  <body>

    <div class="container-fluid" style="margin-top : 10%">
      <div class="row text-center">

        <div class="col-12 col-sm-12 col-md-12 col-lg-4 text-center ">

        </div>



        <div class="col-12 col-sm-12 col-md-12 col-lg-4 text-center ">
          <div class="card">
              <div class="card-header">
                  ${detail.subject}
              </div>
              <div class="card-body">
                  ${detail.content}
              </div>
              <div class="card-footer">
                  ${detail.writer}
              </div>
          </div>
        </div>


        <div class="col-12 col-sm-12 col-md-12 col-lg-4 text-center ">

        </div>


      </div>
    </div>

  </body>
</html>
