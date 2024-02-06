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
<body class="bg-img2">
	<div class="topnav">
		<a class="active" href="#home">Home</a>
		<div class="active">
		<div class="dropdown">
			<button class="btn btn-primary dropdown-toggle" type="button"
				id="dropdown" data-bs-toggle="dropdown" aria-expanded="false">
				Bookins</button>
			<ul class="dropdown-menu" aria-labelledby="dropdown">
				<li><a class="dropdown-item" href="#">Dropdown item</a></li>
				<li><a class="dropdown-item" href="#">Dropdown item</a></li>
				<li><a class="dropdown-item" href="#">Dropdown item</a></li>
			</ul>
		</div>
	</div>
		<a href="#contact">Contact us</a>
		 <a href="#about">About</a>
	</div>


</body>
</html>