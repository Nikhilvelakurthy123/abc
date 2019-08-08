package Send;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendDemo extends HttpServlet{
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String uname = req.getParameter("user_name");
		String password = req.getParameter("password");
		pw.println(uname+" password="+password);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikhil","root");
		    String q = "insert into servlet values ('"+uname+"','"+password+"')";
		    pw.print(q);
			Statement st = conn.createStatement();
			int qq = st.executeUpdate(q);
			pw.write(qq);
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
