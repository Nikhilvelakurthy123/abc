package Send;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Create extends HttpServlet{

	public  void doPost(HttpServletRequest req , HttpServletResponse res) {
		// TODO Auto-generated method stub

		Connection con = DAO.getConn();
		Statement st;
		try {
			st = con.createStatement();
			st.execute("create table fetch(id varchar(9))");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
