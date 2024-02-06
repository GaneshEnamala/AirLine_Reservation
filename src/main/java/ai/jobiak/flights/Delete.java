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
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
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

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/air", "root", "Ganesh@415");	
			Statement stt = con.createStatement();
			String select = "select * from Bookings";
			ResultSet rs = stt.executeQuery(select);
			String pass = "nill";
			while(rs.next()) {
				if(pass.equals(rs.getString(8))){
					Statement stmt = con.createStatement();
					String delete = "delete from Bookings where pnr="+rs.getString(1);
					stmt.executeUpdate(delete);
						out.println("<meta http-equiv=\"refresh\" content=\"0;url=Booking.jsp\" />\r\n");
				}else {
					out.println("<meta http-equiv=\"refresh\" content=\"0;url=Booking.jsp\" />\r\n");
				}
				
			}
			
			rs.close();
		} catch (Exception e) {
			out.println(e);
		}
		out.close();
	}
}
