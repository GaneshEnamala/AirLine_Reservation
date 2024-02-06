<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jobiak Flights</title>
<link href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css"
	type="text/css" rel="stylesheet" />
	
	<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: white;
}

.topnav a {
  float: left;
  color: darkgrey;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: black;
  color: white;
}

.topnav a.active {
  background-color: black;
  color: white;
}
</style>
	
</head>
<body>

<div class="topnav">
<div class="btn-group" >
<button class="btn btn-info">Home</button>

	<div class="container">
		<div class="btn-group" >
			<button class="btn btn-info">Manage <span class="badge" ></span></button>
			<button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" ><span class="caret" ></span></button>
			<ul class="dropdown-menu" role="menu">
			<li><a href="#Edit">Edit Booking</a></li>
			<li><a href="#Edit">Change Flight</a></li>
			<li><a href="#Edit">Cancel Booking</a></li>
			<li><a href="#Edit">Booking Status</a></li></ul>
		</div>
	
	
	<a href="userlogin.jsp"><button class="btn btn-info">Contact us</button></a>
	<a href="userlogin.jsp"><button class="btn btn-info">About us</button></a>
	<a href="userlogin.jsp"><button class="btn btn-info">Login/Register</button></a>
	</div>
	</div>
</div>
</body>
</html>