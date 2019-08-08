package Send;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	static Connection con = null;
static 
{
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikhil","root");
	}
	catch(Exception e)
	{
		
	}
	
	
}
public static Connection getConn()
{
	return con;
}
}
