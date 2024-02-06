<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css"
	type="text/css" rel="stylesheet" />
    </head>
    <style>
    body {
	background-image: url("aeroplane3.jpg");
	opacity: 100%;
}
.bg-img2 {
  background-image: url("aeroplane3.jpg");
  min-height: 500px;
  background-position: right;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}
</style>
<body class="bg-img2">
<form method="get" action="PrintTicket">
<div class="form-group row">
				<div class="col-sm-12">
					Enter PNR Number <input type="text" id="pnr"
						class="form-control mb-4" name="pnr"
						placeholder="Enter PNR" required>
				</div>
			</div>

			<div class="form-group row">
				<div class=" col-sm-12">
					<button class="btn btn-success" type="submit" onclick="validpass()">
						Print Ticket</button>
					<button class="btn btn-info" type="reset">Reset</button>
					<a href="userhome.jsp" class="btn btn-warning" type="reset">Home</a>
				</div>
			</div>
</form>
</body>
</html>