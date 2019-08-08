package Send;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Select extends HttpServlet{
	public  void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub

		Connection con = DAO.getConn();
		Statement st;
		try {
			PrintWriter pw = res.getWriter();                                       
			st = con.createStatement();
			ResultSet res1 = st.executeQuery("select * from  fetch");
			while(res1.next())
			{
				pw.println(res1.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
