<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.user.Student" %>
    
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body> 


<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <%  Student student = (Student) session.getAttribute("student");  %>
          Welcome To <%  out.print("Claim Academy!");  %>
        </div>
        <div id="navbar" class="navbar-collapse collapse">       
        </div><!--/.navbar-collapse -->
      </div>
    </nav> 
    <!-- Main jumbotron for a primary marketing message or call to action -->
    
    <div class="jumbotron">
      <div class="container">
      
        <h1>Hello, <%  out.print(student.getFirstName());  %></h1>
        <p>This is a simple java servlet program for a functional website. </p>
      </div>
    </div>
    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>My GPA </h2>
          <p><%  out.print(student.getGpa());  %></p>
			<!--  	<p><a class="btn btn-default" href="GpaServlet" role="button">View GPA </a></p>
        --> </div>        
        <div class="col-md-4">
          <h2>Enter Grades </h2>
           <form action="GpaServlet" method="post">
           <div class="form-group">
    <label for="gradeOne">GradeOne</label>
    <input type="text" class="form-control" name="gradeOne" id="gradeOne" placeholder="Grade One">
  </div>
  <div class="form-group">
    <label for="gradeTwo">Grade Two</label>
    <input type="text" class="form-control" name="gradeTwo" id="gradeTwo" placeholder="Grade Two">
  </div>
  <div class="form-group">
    <label for="gradeThree">Grade Three</label>
    <input type="text" class="form-control" name="gradeThree" id="gradeThree" placeholder="Grade Three">
  </div>           
             <button type="submit" class="btn btn-default">Submit</button>           
           </form>       
         </div>        
      <hr>
      <footer>
        <p>&copy; 2017 Company, Inc.</p>
      </footer>
    </div> <!-- /container -->
    </div>

</body>
</html>