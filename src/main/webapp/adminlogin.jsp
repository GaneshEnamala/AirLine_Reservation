<!DOCTYPE html>
<html>
    <head>
        <title>Login page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css"
	type="text/css" rel="stylesheet" />
    </head>
    <style>
.bg-img2 {
  background-image: url("aeroplane1.png");
  min-height: 500px;
  background-position: right;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
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
	<h2 align="center" style="color: Red">Login as Admin</h2>
	<div class="d-flex justify-content-center">
		<form method="get" action="login" onsubmit="return validcap()">
			<div class="form-group row">
				<div class="col-sm-12">
					Email Id<input type="email" class="form-control mb-4" name="bemail"
						placeholder="Enter your email id" required>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-12">
					Enter Password <input type="password" id="pass"
						class="form-control mb-4" name="bpass"
						placeholder="Enter your password" required>
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
					<button class="btn btn-success" type="submit" onclick="validpass()">
						Login</button>
					<a class="btn btn-info" type="reset">Reset</a>
					<a class="btn btn-warning" href="userlogin.jsp" >Login as User</a>
				</div>
			</div>

		</form>
	</div>
</body>
</html>