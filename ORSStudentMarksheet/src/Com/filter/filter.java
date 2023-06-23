package Com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class filter implements Filter {

	public void destroy() {

		System.out.println("This is destroy method");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 = (HttpServletResponse) response;
		HttpSession session= request2.getSession();
		if(session.getAttribute("user")==null){
			System.out.println("it is in filter");
			RequestDispatcher rd = request2.getRequestDispatcher("/Layout.jsp?body=Login.jsp");
			rd.forward(request2, response2);
		}
		else{
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("This is init method");
	}

}
