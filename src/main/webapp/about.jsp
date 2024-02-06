<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About</title>
<style type="text/css">
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
footer {
	text-align: center;
   position:absolute;
   bottom:0;
   width:100%;
   height:60px;   /* Height of the footer */
   background:;
}
</style>
</head>
<body>
<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="userhome.jsp">Bookings</a></li>
  <li><a href="userlogin.jsp">Login/Register</a></li>
  <li><a href="adminlogin.jsp">Authorized Login</a></li>
  <li><a href="contactus.jsp">Contact</a></li>
  <li><a href="about.jsp">About</a></li>
</ul>
<h1 style="color:red">Welcome to the Jobiak Flights.</h1>
</body>
</html>