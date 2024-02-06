<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Flight...</title>
<link href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css"
	type="text/css" rel="stylesheet" />
	<style>
body {
	background-image: url("aeroplane3.jpg");
	opacity: 100%;
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: black;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: yellow;
}
</style>
</head>
<body class="bg-img2">
	<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="userhome.jsp">Bookings</a></li>
  <li><a href="userlogin.jsp">Login/Register</a></li>
  <li><a href="adminlogin.jsp">Authorized Login</a></li>
  <li><a href="contactus.jsp">Contact</a></li>
  <li><a href="about.jsp">About</a></li>
</ul>
		<h1 align="center" style="color: Red">Select Domain</h1>
		<div class="d-flex justify-content-center">
		<div class="form-group row">
			<div class="col-sm-12">
			<a href="DomesticBooking.jsp" class="btn btn-warning">Domestic</a>
				<a href="InternationalBooking.jsp" class="btn btn-danger">International</a>
				<a href="userhome.jsp" class="btn btn-info">Home</a>
			</div>
		</div>
	</div>
</body>
</html>