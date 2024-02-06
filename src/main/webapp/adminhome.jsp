<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
<style type="text/css">
body {
	background-image: url("aeroplane1.png");
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
  background-color: red;
}

</style>
</head>
<body class="bg-img2">
<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="Bookings">Bookings</a></li>
  <li><a href="Flights">Flights</a></li>
  <li><a href="index.jsp">Logout</a></li>
</ul>
</html>