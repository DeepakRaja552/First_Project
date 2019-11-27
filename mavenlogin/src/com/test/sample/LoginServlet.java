package com.test.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("emailaddress");
		String password=request.getParameter("password");
		
		if(!name.equals("")){
			
			HttpSession reqSession = request.getSession();
			reqSession.setAttribute("name", name );
			
			out.println("welcome profile");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else{
			out.print("Sorry, username or password error!");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
	}

}
