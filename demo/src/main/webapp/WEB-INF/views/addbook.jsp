<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Book form</h2>
  <form action="saveBook" method="post" modelAttribute="book">
    <div class="form-group">
      
      <input type="hidden" class="form-control" id="id" name="id" value="${book.id}">
    </div>
  
    <div class="form-group">
      <label for="title">Enter Book Title:</label>
      <input type="text" class="form-control" id="title" placeholder="Title" name="title">
    </div>
    <div class="form-group">
      <label for="author">Enter Book Author:</label>
      <input type="text" class="form-control" id="author" placeholder="Author" name="author">
    </div>
    <div class="form-group">
      <label for="price">Enter Book Price:</label>
      <input type="text" class="form-control" id="price" placeholder="Price" name="price">
    </div><button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body> 
</html>