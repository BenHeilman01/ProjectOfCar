<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>


   
<meta charset="ISO-8859-1">
<title>Car Inventory Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  


<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>

<!-- Home/Sell/About us/Contact buttons-->
<body style="padding-top: 65px; margin: 20px;">
 <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Heilman's Car Market</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="http://localhost:8080/ServletProject/Test.jsp">Home</a></li>
            <li><a href="http://localhost:8080/ServletProject/About.jsp">About</a></li>
            <li><a href="http://localhost:8080/ServletProject/ContactUsCar.jsp">Contact</a></li>
            <li><a href="http://localhost:8080/ServletProject/CarInvPage.jsp">Sell A Car</a></li>
            <li><a href="http://localhost:8080/ServletProject/CarLogIn.jsp">Buy A Car</a></li>
            <li><a href="http://localhost:8080/ServletProject/CarSearch.jsp">Search By Model</a></li>
          </ul>
        </div> 
      </div>
    </nav>

<body>

<!-- Info to add customer -->
<form class="container" action ="CustomerServlet" method="post">
<div class="form-group">
    <label for="firstName"> *First Name </label>
    <input type="text" class="form-control" name="firstName" id="firstName" placeholder="First Name">
  </div>
  <div class="form-group">
    <label for="lastName">*Last Name</label>
    <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Last Name">
  </div>
  <div class="form-group">
    <label for="email">*Email address</label>
    <input type="text" class="form-control" name="email" id="exampleInputEmail1" placeholder="Email">
  </div>
    <div class="form-group">
    <label for="tex">*Phone Number</label>
    <input type="text" class="form-control" name="telephone" id="telephone" placeholder="Telephone">
  </div>
	<div class="form-group">
	<label for="text">*VIN Of The Car You Would Like to Buy</label>
	<input type="text" class="form-control" name="custVin" id="custVin" placeholder="VIN">
	
  </div>


  <div class="checkbox">
    <label>
      <input type="checkbox"> Check me out
    </label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>


</body>
</html>