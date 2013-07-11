package br.com.altieres.security;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;

@ServletSecurity(value = @HttpConstraint(rolesAllowed = "ADMIN"), httpMethodConstraints = @HttpMethodConstraint("GET"))
public class MyFirstSecurity extends HttpServlet {

	private static final long serialVersionUID = 23L;

}
