package br.com.altieres.annotations;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = {"/MyFilterWithInitParam", "/MyOtherServletWithInitParam"}, initParams = {@WebInitParam(name = "MyNameInitParam", value = "MyValueInitParam")})
public class MyFilterWithInitParam implements Filter {

	private String myValueInitParam;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		myValueInitParam = filterConfig.getInitParameter("MyNameInitParam");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		response.getWriter().println("Hello My Filter With Init Param: " + myValueInitParam);
	}

	@Override
	public void destroy() {
		
	}

}
