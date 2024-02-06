<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact us</title>
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
</style>
</head>
<body>
 <form method="get" action="Contact">
<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="userhome.jsp">Bookings</a></li>
  <li><a href="userlogin.jsp">Login/Register</a></li>
  <li><a href="adminlogin.jsp">Authorized Login</a></li>
  <li><a href="contactus.jsp">Contact</a></li>
  <li><a href="about.jsp">About</a></li>
</ul>
<div class="container">
   <div class="contact-parent">
      <div class="contact-child child1">
         <p>
            <i class="fas fa-map-marker-alt"></i> Address <br />
            <span> Jobiak Flights
            <br />
            MA, USA
            </span>
         </p>
         <p>
            <i class="fas fa-phone-alt"></i> Let's Talk <br />
            <span> 0787878787</span>
         </p>
         <p>
            <i class=" far fa-envelope"></i> General Support <br />
            <span>contact@example.com</span>
         </p>
      </div>
      <div class="contact-child child2">
         <div class="inside-contact">
            <h2>Contact Us</h2>
            <h3>
               <span id="confirm"></span>
            </h3>
           
            <p>Name *</p>
            <input id="txt_name" name="name" type="text" Required="required">
            <p>Email *</p>
            <input id="txt_email" name="email" type="text" Required="required">
            <p>Phone *</p>
            <input id="txt_phone" name="phone" type="text" Required="required">
            <p>Subject *</p>
            <input id="txt_subject" name="subject" type="text" Required="required">
            <p>Pincode *</p>
            <input type="number" id="pncode" name="pncode" required>
            <p>Message *</p>
            <textarea id="txt_message" rows="4" cols="20" name="message" Required="required" ></textarea>
            <input type="submit" id="btn_send" value="SEND">
            
         </div>
      </div>
   </div>
</div>
</form>
</body>
</html>