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
 * Servlet implementation class Flights
 */
@WebServlet("/Flights")
public class Flights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Flights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String userid = (String)session.getAttribute("userid");
		if ( userid==null) {
			//out.println("")\
			response.sendRedirect("adminlogin.jsp");
			return;
		}
        PrintWriter out = response.getWriter();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/air", "root", "Ganesh@415");
		
		Statement st=con.createStatement();
	
		String sql ="select * from flights";
		
		ResultSet rs = st.executeQuery(sql);	
		
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css\"\r\n"
				+ "	type=\"text/css\" rel=\"stylesheet\" />\r\n"
				+ "");
		out.println("<div class='container'>");
		
		 out.println("<table class='table table-striped'>");  
         out.println("<tr><th>Flight_Number</th><th>Flight_Name</th><th>From</th><th>To</th><th>Economic_Class</th><th>Bussiness_Class</th><th>Economic_fare</th><th>Bussiness_fare</th></tr>"); 
		while (rs.next()) {
				out.println("<tr><td>" +rs.getString(1) +"</td><td>" +rs.getString(2) +"</td><td>" +rs.getString(3) 
				+ "</td><td>" + rs.getString(4) + "</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)
				+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)
				+"</td></tr>");
			
		}
		out.println("</table>");
		
		
		out.println("</div>");
		out.println("<h2>");
		
		out.println("<a class=\"btn btn-link\" href= \"adminhome.jsp\">Back</a> " ); 
		out.println("</h2>");
		
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
