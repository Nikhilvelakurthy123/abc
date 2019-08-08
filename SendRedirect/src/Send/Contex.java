package Send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Contex extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		ServletConfig sc = getServletConfig();
		String s = sc.getInitParameter("a");
		String ss = sc.getInitParameter("b");
		pw.println(s);
		pw.println(ss);
	}

}
