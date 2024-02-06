<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Jobaik flights</title>
<style type="text/css">
body {
	background-image: url("aeroplane10.png");
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
  background-color: grey;
}
footer {
	text-align: center;
   position:absolute;
   bottom:0;
   width:100%;
   height:60px;   /* Height of the footer */
   background:;
}
div{
 display: block;
 font-size:80px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: blink;
}
</style>
</head>
<body class="bg-img2">
<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="userhome.jsp">Bookings</a></li>
  <li><a href="userlogin.jsp">Login/Register</a></li>
  <li><a href="adminlogin.jsp">Authorized Login</a></li>
  <li><a href="contactus.jsp">Contact Us</a></li>
  <li><a href="about.jsp">About us</a></li>
</ul>
<marquee behavior="scroll" direction="left" scrollamount="5">Welcome to the Jobiak Flights, Travel anywhere in the world....:)</marquee>
<div align="center">
Jobiak Flights
</div>
</body>
<footer>
  <p>©Jobiak Flights</p>
  <p><a href="jobiakflights@gmail.com">flights@jobiak.com</a></p>
</footer>
</html>