package ai.jobiak.flights;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyerRegistration
 */
@WebServlet("/userRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("phno");
		String gender = request.getParameter("gender");
		String password = request.getParameter("pwd");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/air", "root", "Ganesh@415");	
			
        PreparedStatement ps = con.prepareStatement("insert into users(fname,lname,email,mobile,gender,pwd) values(?,?,?,?,?,?)");
        	ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, mobile);
			ps.setString(5, gender);
			ps.setString(6, password);
			
			ps.executeUpdate();
			
			out.println("Registered Successfully <meta http-equiv=\"refresh\" content=\"0;url=userlogin.jsp\" />\r\n"
					+ "");
			/*
			 * out.println(" <h3><a href='bookindex.html'>Go back</a></h3>\r\n" +
			 * "				<a class=\"btn btn-danger\"  href=\"index.html\">Goto Home</a>"
			 * );
			 */
			
		} catch (Exception e) {
			out.println(e);
		}
		out.close();
	}

}
