package br.com.altieres.annotations;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = { "/MyServletWithInitParam", "/MyOtherServletWithInitParam" }, initParams = { @WebInitParam(name = "MyNameInitParam", value = "MyValueInitParam") })
public class MyServletWithInitParam extends HttpServlet {

	private static final long serialVersionUID = 23L;

	private String myValueInitParam;

	@Override
	public void init(ServletConfig config) throws ServletException {
		myValueInitParam = config.getInitParameter("MyNameInitParam");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.getWriter().println(
				"Hello My Servlet With Init Param: " + myValueInitParam);
	}

}
