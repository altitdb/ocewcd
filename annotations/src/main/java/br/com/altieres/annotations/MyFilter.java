package br.com.altieres.annotations;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "MyFilter", 
		   description = "My Filter Using Annotations", 
		   urlPatterns = "/MyOtherPattern", 
		   initParams = { @WebInitParam(name = "name", value = "value") }, 
		   displayName = "MyDisplayName", 
		   asyncSupported = true, 
		   dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD}, 
		   servletNames = "MyServlet")
public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		response.getWriter().println("Hello My Filter");
	}

	@Override
	public void destroy() {

	}

}
