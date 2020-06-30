<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>권문수 게시판</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    

    <style media="screen">
      .container {
        margin-top : 10%;
      }
      th{
        color : white;
      }

      td{
        color : white;
      }

      .title.text-center {
        margin-bottom : 3em;
        color : white;
      }

      body {
      
        background-image: url("/static/hotair.jpg");
        
      }

    </style>

  </head>


  <body>
    <div class="container-fluid">

      <div class="container">

        <div class="title text-center">
          <h1>권문수 게시판</h1>
        </div>

        <table class="table table-hover text-center">
          <thead>
            <tr>
              <th width="20%">번호</th>
              <th>게시물 제목</th>
              <th>작성자</th>
              <th>날짜</th>
            </tr>
          </thead>
          <tbody>
          		
          	<c:forEach var="l" items="${list}">
              <tr onclick="location.href='/detail/${l.bno}'">
                  <td>${l.bno}</td>
                  <td>${l.subject}</td>
                  <td>${l.writer}</td>
                  <td>${l.reg_date}</td>
              </tr>
          </c:forEach>
   
              

          </tbody>
        </table>
      </div>


    </div>

  </body>

</html>
