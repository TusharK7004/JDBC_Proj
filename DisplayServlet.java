package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@SuppressWarnings("serial")
@WebServlet("/dis")
public class DisplayServlet extends GenericServlet {

	public void service(ServletRequest req,ServletResponse res)
			throws ServletException,IOException{
		
		String uName=req.getParameter("Uname");
		String mId=req.getParameter("Mid");
		String ad=req.getParameter("Addr");
		
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		pw.print("UserName: "+uName);
		pw.print("<br>MailID: "+mId);
		pw.print("<br>Address: "+ad);
		
	}
	
	
}
