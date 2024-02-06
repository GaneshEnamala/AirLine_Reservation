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
 * Servlet implementation class PrintTicket
 */
@WebServlet("/PrintTicket")
public class PrintTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintTicket() {
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
			response.sendRedirect("userlogin.jsp");
			return;
		}
		PrintWriter out = response.getWriter();
		int pnr =Integer.parseInt(request.getParameter("pnr"));

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/air", "root", "Ganesh@415");	
			Statement st = con.createStatement();
			String sql ="select * from Bookings where pnr="+pnr;
			
			ResultSet rs = st.executeQuery(sql);	
			
			out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css\"\r\n"
					+ "	type=\"text/css\" rel=\"stylesheet\" />\r\n"
					+ "");
			out.println("<h1>Flight Ticket</h1>");
			out.println("<div class='container'>");
			
			 out.println("<table class='table table-striped'>");  
			 while(rs.next()) {
				 out.println("<tr><th>PNR_Number</th><th>Flight_Number</th></tr>");
				 out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");
				 out.println("<tr><th>Flight_Name</th><th>Journey_Date</th></tr>");
				 out.println("<tr><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
				 out.println("<tr><th>Depature</th><th>Arrival</th></tr>");
				 out.println("<tr><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
				 out.println("<tr><th>Ticket_Class</th><th>Passenger_Name</th></tr>");
				 out.println("<tr><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td></tr>");
				 out.println("<tr><th>Age</th><th>Gender</th></tr>");
				 out.println("<tr><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td></tr>");
				 out.println("<tr><th>Seat_Number</th><th>UserId</th></tr>");
				 out.println("<tr><td>"+rs.getString(12)+"</td><td>"+rs.getString(11)+"</td></tr>");
			 }
				/*
				 * out.println(
				 * "<tr><th>Flight_Number</th><th>Flight_Name</th><th>From</th><th>To</th><th>Economic_Class</th><th>Bussiness_Class</th><th>Economic_fare</th><th>Bussiness_fare</th></tr>"
				 * ); while (rs.next()) { out.println("<tr><td>" +rs.getString(1) +"</td><td>"
				 * +rs.getString(2) +"</td><td>" +rs.getString(3) + "</td><td>" +
				 * rs.getString(4) + "</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)
				 * +"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8) +"</td></tr>");
				 * 
				 * }
				 */
			out.println("</table>");
			
			
			out.println("</div>");
			out.println("<h2>");
			
			out.println("<a class=\"btn btn-link\" href= \"userhome.jsp\">Back</a> " );
			out.println("</h2>");
			
			
		} catch (Exception e) {
			out.println(e);
		}
		out.close();
	}

}
