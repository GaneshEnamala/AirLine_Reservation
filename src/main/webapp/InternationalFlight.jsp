<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>International Booking</title>
<link href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css"
	type="text/css" rel="stylesheet" />
		
	<style>
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
	<h2 align="center" style="color:Black">Passenger Details</h2>
	<div class="d-flex justify-content-center">
		<form method="get" action="BookFlight">

			<div class="form-group row">
				<div class="col-sm-12" >
					Enter Name <input type="text" class="form-control mb-4"
						name="name" placeholder="Enter your name" required>
				</div>
			</div>


			<div class="form-group row">
				<div class="col-sm-12">
					Age<input type="text" class="form-control mb-4" min="1" max="100"
						name="age" placeholder="Enter your age in years" required>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-12">
					Phone Number <input type="text" pattern="[1-9]{1}[0-9]{9}"
						class="form-control mb-4" name="phno"
						placeholder="enter your phone number" required>
				</div>
			</div>
			
			<label for="gender" >Choose gender</label>
			<select name="gender" id="gender" >
			<option value="Male" >Male</option>
			<option value="Female" >Female</option>
			<option value="Transgender" >Transgender</option>
			</select>
			
			<label for="gender" >Choose Class</label>
			<select name="class" id="class" >
			<option value="economic" >Economic</option>
			<option value="bussiness" >Bussiness</option>
			</select>

			<div class="form-group row">
				<div class=" col-sm-12">
					<button class="btn btn-success" type="submit">
						Book Ticket</button>
					<button class="btn btn-primary" type="reset">Reset</button>
				<a href="JobiakFlights2.jsp" class="btn btn-warning">Home</a>
				</div>
			</div>
	
		</form>
	</div>
</body>
</body>
</html>