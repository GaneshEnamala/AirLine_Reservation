package ai.jobiak.flights;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookFlight
 */
@WebServlet("/BookFlight")
public class BookFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String userid = (String)session.getAttribute("userid");
		if ( userid==null) {
			//out.println("")\
			response.sendRedirect("userlogin.jsp");
			return;
		}
		//HttpSession session=request.getSession();
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String passenger = request.getParameter("name");
        int age =Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String clas =request.getParameter("class");
        
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/air", "root", "Ganesh@415");
		String pnr =null;
		String no=null;
		Statement stt = con.createStatement();
		String select = "select * from Bookings";
		ResultSet rs = stt.executeQuery(select);
		while(rs.next()) {
			pnr=rs.getString(1);
			no =rs.getString(2);
		}
		String fare=null;
		Statement stt2 = con.createStatement();
		String select2 = "select * from flights where flight_no="+no;
		ResultSet rs2 = stt2.executeQuery(select2);
		while(rs2.next()) {
			if(clas.equals("economic")) {
				fare=rs2.getString(7);
			}else {
				fare=rs2.getString(8);
			}
			
		}
		
		rs2.close();
		
		rs.close();
	
		PreparedStatement st = con.prepareStatement("update bookings set passenger=?,age=?,gender=?,fare=?,userid=?,seat=? where pnr= "+pnr);
		st.setString(1, passenger);
		st.setInt(2, age);
		st.setString(3, gender);
		st.setString(4, fare);
		st.setString(5, userid);
		st.setLong(6,Integer.parseInt(pnr)-91700);
		st.executeUpdate();
		
		out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css\"\r\n"
				+ "	type=\"text/css\" rel=\"stylesheet\" />\r\n"
				+ "");
		out.println("<div class='container'>");
		
		 out.println("<table class='table table-striped'>");  
       
		out.println("</table>");
		out.println("</div>");
		out.println("<h2>");
		out.println("Booked successfully...");
		//out.println("Ticked Booked successfully<a class=\"btn btn-link\" href= 'PrintTicket?pnr="+rs.getString(1)+"'>Print Ticket</a> ");
		out.println("<a class=\"btn btn-link\" href= \"Booking.jsp\">Back</a> " );
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
		//HttpSession session=request.getSession();
				response.setContentType("text/html");
				HttpSession session=request.getSession();
				String userid = (String)session.getAttribute("userid");
				if ( userid==null) {
					//out.println("")\
					response.sendRedirect("userlogin.jsp");
					return;
				}
		        PrintWriter out = response.getWriter();
		        String from = request.getParameter("from");
		        String to = request.getParameter("to");
		        String date = request.getParameter("date");
		        int flag=1;
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
		         out.println("<tr><th>Flight_Number</th><th>Flight_Name</th><th>From</th><th>To</th><th>Economic_Class</th><th>Bussiness_Class</th><th>Economic_fare</th><th>Bussiness_fare</th><th>Book</th></tr>"); 
				while (rs.next()) {
					if(from.equals(rs.getString(3)) && to.equals(rs.getString(4))) {
						out.println("<tr><td>" +rs.getString(1) +"</td><td>" +rs.getString(2) +"</td><td>" +rs.getString(3) 
						+ "</td><td>" + rs.getString(4) + "</td><td>"+rs.getDouble(5)+"</td><td>"+rs.getString(6)
						+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)
						+"</td><td><a href='InternationalFlight.jsp?flight_no="+rs.getString(1)+"'>Book</></td></tr>");
						PreparedStatement st2 = con.prepareStatement("insert into bookings(flight_no,name,date,from_place,to_place,passenger) values(?,?,?,?,?,?)");
						st2.setString(1, rs.getString(1));
						st2.setString(2, rs.getString(2));
						st2.setString(3, date);
						st2.setString(4, from);
						st2.setString(5, to);
						st2.setString(6,"nill");
						st2.executeUpdate();
						flag++;
					}	
				}
				out.println("</table>");
				out.println("</div>");
				
				if(flag==1) {
					out.println("No flights between the these two places");
				}
				out.println("<h2>");
				out.println("<a class=\"btn btn-link\" href= \"Delete\">Go Back</a> " );
				out.println("</h2>");
				}
				catch(Exception e) {
					System.out.println(e.toString());
				}
	}

}
