<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
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
            <li class="active"><a href="http://localhost:8080/ServletProject/CarProject.jsp">Home</a></li>
            <li><a href="http://localhost:8080/ServletProject/About.jsp">About</a></li>
            <li><a href="http://localhost:8080/ServletProject/ContactUsCar.jsp">Contact</a></li>
            <li><a href="http://localhost:8080/ServletProject/CarInvPage.jsp">Sell A Car</a></li>
            <li><a href="http://localhost:8080/ServletProject/CarSearch.jsp">Search By Model</a></li>
          </ul>
        </div> 
      </div>
    </nav>

	<span class="border border-primary"Heilman's Car Market></span><strong><center>Heilman's Car Market</center></strong>
	<br>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body style = "background: silver">   

<div class="container">
  <h2><span style="color:red">Deals Of The Day</span></label></h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="pics/Bat.jpg" alt="Los Angeles" style="width:55%; height:350px;">
        <div class="carousel-caption">
        <h3><a href="http://localhost:8080/ServletProject/CarLogIn.jsp" target="_blank"> click here to purchase</a></h3>
      </div>
      </div>

      <div class="item">
        <img src="pics/CAR2.jpg" alt="Chicago" style="width:60%;height:350px;">
        <div class="carousel-caption">
        <h3><a href="http://localhost:8080/ServletProject/CarLogIn.jsp" target="_blank"> click here to purchase</a></h3>
	  </div>
      </div>
    
      <div class="item">
        <img src="pics/SUV.jpg" alt="New york" style="width:60%;height:350px;">
        <div class="carousel-caption">
        <h3><a href="http://localhost:8080/ServletProject/CarLogIn.jsp" target="_blank"> click here to purchase</a></h3>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <br>
  <!-- Hard Coded cars -->
<div class="inline - block" style="width: 30rem;">
  <img src="pics/07_Escape.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="inline - block">
    <h5 class="card-title">'07 Escape</h5>
    <p class="card-text">Selling Price $3,000: Miles 299,572: MPG: 20 City / 24 hwy</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
    <form method="get" action="CarArrayServlet">
    <button type="button" class="btn btn-primary"> Submit </button>
    </form>
    </div>
  </div>
    <br>
<div class="card" style="width: 30rem;">
  <img src="pics/11_RAV4.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">2011 RAV4</h5>
    <p class="card-text">Selling Price $12,000: Miles 83,544: MPG: 22 City / 26 hwy</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
  </div>
    <br>
<div class="card" style="width: 30rem;">
  <img src="pics/CAR3.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">2019</h5>
    <p class="card-text">Selling Price $100,000: Miles 143: MPG: Don't worry about it</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary">click here to purchase</a>
  </div>
</div>
</div>
<br>
<div class="card" style="width: 30rem;">
  <img src="pics/01_Mustang.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">'01 Mustang</h5>
    <p class="card-text">Selling Price $4,200: Miles 133,753: MPG: 17 city / 25 hwy</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
    </div>
  </div>
    <br>
    <div class="card" style="width: 30rem;">
  <img src="pics/08_Jeep.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">08 Jeep</h5>
    <p class="card-text">Selling Price $8,200: Miles 179,594: MPG: 15 City / 19 hwy</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
    </div>
  </div>
    <br><div class="card" style="width: 30rem;">
  <img src="pics/14_Explorer.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">'14_Explorer</h5>
    <p class="card-text">Selling Price $12,995: Miles 169,272: MPG: 13 City / 17 hwy</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
    </div>
  </div>
    <br><div class="card" style="width: 30rem;">
  <img src="pics/79_El.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">'79 El Camino</h5>
    <p class="card-text">Selling Price $9,995: Miles 95,851: MPG: n/a</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
    </div>
  </div>
    <br><div class="card" style="width: 30rem;">
  <img src="pics/93_New_Yorker.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">'93 New Yorker</h5>
    <p class="card-text">Selling Price $3,600: Miles 256,502: MPG: 18 City / 24 hwy</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
    </div>
  </div>
    <br><div class="card" style="width: 30rem;">
  <img src="pics/01_Focus.jpg" class="card-img-top" style="width:60%;height:70%" alt="...">
  <div class="card-body">
    <h5 class="card-title">'01 Ford Focus</h5>
    <p class="card-text">Selling Price $3,200: Miles 167,359: MPG: 22 City / 30 hwy</p>
    <a href="http://localhost:8080/ServletProject/CarLogIn.jsp#" class="btn btn-primary"> click here to purchase </a>
    </div>
  </div>
    <br>

</body>
</html>
 