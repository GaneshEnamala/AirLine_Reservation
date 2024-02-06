package ai.jobiak.flights;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userid = request.getParameter("bemail");
		String password = request.getParameter("bpass");
		int flag=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/air", "root", "Ganesh@415");	
			Statement stmt = con.createStatement();
			String select = "select id,pwd from admin";
			ResultSet rs = stmt.executeQuery(select);
			while(rs.next()) {
				if(userid.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					flag=1;
					
					HttpSession session = request.getSession();
					session.setAttribute("userid", userid);
				}
				
			}
			if(flag==1) {
				out.println("<meta http-equiv=\"refresh\" content=\"0;url=adminhome.jsp\" />\r\n");
			}else {
				//out.println("<h1 style=\"color:red\"> Invalid Userid or Password </h1>");
				//out.println("<a href='adminlogin.html' class='btn btn-primary' > <h1 style=\"color:green\"> Try Again </h1></a>");
				out.println("Login failed");
				out.println("<meta http-equiv=\"refresh\" content=\"2;url=adminlogin.jsp\" />\r\n");
			}
			
		} catch (Exception e) {
			out.println(e);
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userid = request.getParameter("bemail");
		String password = request.getParameter("bpass");
		int flag=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/air", "root", "Ganesh@415");	
			Statement stmt = con.createStatement();
			String select = "select email,pwd from users";
			ResultSet rs = stmt.executeQuery(select);
			while(rs.next()) {
				if(userid.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					flag=1;
					
					HttpSession session = request.getSession();
					session.setAttribute("userid", userid);
				}
				
			}
			if(flag==1) {
				out.println("<meta http-equiv=\"refresh\" content=\"0;url=userhome.jsp\" />\r\n");
			}else {
				//out.println("<h1 style=\"color:red\"> Invalid Userid or Password </h1>");
				//out.println("<a href='adminlogin.html' class='btn btn-primary' > <h1 style=\"color:green\"> Try Again </h1></a>");
				out.println("Login failed");
				out.println("<meta http-equiv=\"refresh\" content=\"2;url=userlogin.jsp\" />\r\n");
			}
			
		} catch (Exception e) {
			out.println(e);
		}
		out.close();
	}

}
