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
<body style="padding-top: 65px; margin: 20px;">
<body >
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
    </body>
<center><h1><strong>Heilman's Car Market</strong></h1></center>
<center><h4>Thank you for checking us out!  If you see a car you like, just copy the VIN and click the, "Buy A Car" link at the top of the page!</h4></center>
<c:forEach items="${carInv}" var="item">
    ${item.name}<br>
<div class="col-md-4">
<div class="card mb-4 shadow-sm">
<img alt="" class="card-image" width="225px" height="225px"
src="pics/${item.name}.jpg" />
<div class="card-body">
<div class="carDetails">
<p>
<strong>Model: </strong> ${item.model}
</p>
<p>
<strong>Year: </strong> ${item.year}
</p>
<p>
<strong>Price: </strong> ${item.price}
</p>
<p>
<strong>Description: </strong> ${item.description}
</p>
<p>
<strong>VIN: </strong> ${item.vin}
</p>
<p>
<strong>Bought By </strong> ${item.boughtBy}
</p>
</div>
</div>
</div>
</div>
</c:forEach>
</body>
</html>