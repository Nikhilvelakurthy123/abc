package Send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//servlet Contex whole classes in web.xml
//servlet Config single classe in web.xml
public class ServletConfig extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		ServletContext sc = getServletContext(); 
		String s = sc.getInitParameter("aa");
		String ss = sc.getInitParameter("ab");
		pw.println(s);
		pw.println(ss);
	}
}