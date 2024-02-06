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
 * Servlet implementation class ContactUs
 */
@WebServlet("/Contact")
public class ContactUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactUs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/air", "root", "Ganesh@415");	
			
        PreparedStatement ps = con.prepareStatement("insert into contactus(name,email,phone,subject,message) values(?,?,?,?,?)");
        	ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, phone);
			ps.setString(4, subject);
			ps.setString(5, message);
			
			ps.executeUpdate();
			
			out.println("Thank you for contact us :) <meta http-equiv=\"refresh\" content=\"3;url=index.jsp\" />\r\n"
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
