<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Car Search</title>

   
<meta charset="ISO-8859-1">

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  


<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

</head>

<body>
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
    
      <form action="CarSearchServlet"
      method="POST">
      <div class="form-group">
    <label for="name">Search</label>
    <input type="text"  class="form-control" id="name" aria-describedby="Search" placeholder="Enter Model" name="searchModel">
    <small id="emailHelp" class="form-text text-muted">Enter The Model You Would Like To Search For</small>
    
    <button type="submit" class="btn btn-primary">Submit</button>
    </div>
 	</form> 
 	<br>
  
        
      <div>
      <c:if test="${searchList != null}"> 
      <table class="table">
     
    <thead>
      <tr>
        <th>name</th>
        <th>model</th>
        <th>year</th>
        <th>price</th>
        <th>VIN</th>
        <th>Bought By</th>
      </tr>
      <c:forEach var="car" items = "${searchList}">
      <tr>
      <td><c:out value="${car.name}"/></td>
      <td><c:out value="${car.model}"/></td>
      <td><c:out value="${car.year}"/></td>
      <td><c:out value="${car.price}"/></td>
      <td><c:out value="${car.vin}"/></td>
      
      </tr>
      </c:forEach>
    </thead>

  </table>
  </c:if> 
</div>
</body>
</html>