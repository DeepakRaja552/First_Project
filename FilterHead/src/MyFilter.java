import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/myservlet1")
public class MyFilter implements Filter {
	

    public void doFilter(ServletRequest request ,ServletResponse response,FilterChain chain)throws ServletException,IOException
    {
    	response.setContentType("text/html");
    	PrintWriter out =response.getWriter();
    	System.out.println("in the filter");
    	HttpServletRequest req=(HttpServletRequest)request;
    	String name1=req.getParameter("name");
    	String password1=req.getParameter("password");
    	
    		 out.print("<h1>Welcome</h1>");
			 chain.doFilter(request, response);
			 out.print("<footer><p>AboutUs</p></footer>");
	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
    		
	
}
