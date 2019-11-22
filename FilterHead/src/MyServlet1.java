import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet1")
public class MyServlet1 extends HttpServlet{
	
	 protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		 PrintWriter out=response.getWriter();
		
		 String a=request.getParameter("name");
		 out.println("welcome "+ a);
		 request.getRequestDispatcher("/Head1.html").include(request, response);
	 }
	}