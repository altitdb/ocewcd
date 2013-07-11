package br.com.altieres.annotations;

import java.io.IOException;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "WebServlet", description = "My Servlet Using Annotations", urlPatterns = {"/MyServlet", "/MyOtherPattern"}, initParams = { @WebInitParam(name = "name", value = "value") }, displayName = "MyDisplayName", asyncSupported = true, loadOnStartup = 1)
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 23L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.getWriter().println("Hello My Web Servlet");
	}

}
