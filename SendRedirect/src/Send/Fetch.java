package Send;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fetch extends HttpServlet{

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikhil","root");
			Statement st = con.createStatement();
			String a = req.getParameter("user_name");
			String b = req.getParameter("password");
			//pw.println("select * from servlet where name='"+a+"' & password ='"+b+"'");
			ResultSet rs = st.executeQuery("select * from servlet where name='"+a+"' and password ='"+b+"'");
			pw.println("<html><table><tr><td>username</td><td>password</td>");
		    while(rs.next())
			{
				
			    pw.print("<tr><td>"+rs.getString(1)+"</td> <td>"+rs.getString(2)+"</td></tr>");
			}
			pw.println("</table>");
			//pw.print(rs.previous());
		}
		catch(Exception e)
		{
			pw.print("error     ======== "+e);
		}
	}
}
