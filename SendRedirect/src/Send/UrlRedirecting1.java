package Send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UrlRedirecting1 extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	String a = req.getParameter("g");
	pw.println(" hai "+a);
	}
}
