<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
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
footer {
	text-align: center;
   position:absolute;
   bottom:0;
   width:100%;
   height:60px;   /* Height of the footer */
   background:;
}
</style>

<script type="text/javascript">
		function cap() {

			var alpha=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V'
			           ,'W','X','Y','Z','1','2','3','4','5','6','7','8','9','0','a','b','c','d','e','f','g','h','i',
			           'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];

			var a=alpha[Math.floor(Math.random()*62)];
			var b=alpha[Math.floor(Math.random()*62)];
			var c=alpha[Math.floor(Math.random()*62)];
			var d=alpha[Math.floor(Math.random()*62)];
			var e=alpha[Math.floor(Math.random()*62)];
			var f=alpha[Math.floor(Math.random()*62)];

			var sum=a + b + c + d + e + f;

			document.getElementById("capt").value=sum;
		}

		function validcap() {
			var string1 = document.getElementById('capt').value;
			var string2 = document.getElementById('textinput').value;
			if (string1 == string2){
				//alert("Form is validated Succesfully");
				return true;
			}
			else {
				alert("Invalid Capecha code");
				return false;
			}
		}
		
		function validpass() {
			var string3 = document.getElementById('pass').value;
			var string4 = document.getElementById('repass').value;
			if (string4 == string3){
				//alert("Form is validated Succesfully");
				return true;
			}
			else {
				alert("Password not matched ");
				return false;
			}
		}
		
	</script>	
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
	<h2 align="center" style="color:Black">New Registration</h2>
	<div class="d-flex justify-content-center">
		<form method="get" action="userRegistration" onsubmit="return validpass(),validcap()">

			<div class="form-group row">
				<div class="col-sm-12" >
					Enter First Name <input type="text" class="form-control mb-4"
						name="fname" placeholder="Enter your first name" required>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-12">
					Enter Last Name <input type="text" class="form-control mb-4"
						name="lname" placeholder="Enter your last name" required>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-12">
					Email Id<input type="email" class="form-control mb-4"
						name="email" placeholder="Enter your email id" required>
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
			<option value="Transgender" >Others</option>
			</select>

			<div class="form-group row">
				<div class="col-sm-12">
					Enter Password <input type="password" id="pass" class="form-control mb-4"
						name="pwd" placeholder="Enter your password" required>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-12">
					Confirm Password <input type="password" id="repass" class="form-control mb-4"
						name="cpwd" placeholder="Confirm password" required>
				</div>
			</div>

			<div class="form-group row">
				<div class=" col-sm-12">
				<input type="text" id="capt" readonly="readonly">
				<div id="refresh">
					<img src="refresh.jpg" width="50px" onclick="cap()">
				</div>

				<input type="text" id="textinput" placeholder="enter the capecha code" required>
				</div>
				</div>
				
			<div class="form-group row">
				<div class=" col-sm-12">
					<button class="btn btn-success" type="submit">
						Register</button>
					<button class="btn btn-primary" type="reset">Reset</button>
				<a href="userlogin.jsp" class="btn btn-warning">Already registered</a>
				</div>
			</div>
	
		</form>
	</div>
</body>
</html>