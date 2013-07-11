package br.com.altieres.security;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.EmptyRoleSemantic;
import javax.servlet.http.HttpServlet;

@ServletSecurity(httpMethodConstraints = @HttpMethodConstraint(value = "TRACE", emptyRoleSemantic = EmptyRoleSemantic.DENY))
public class MyThirdSecurity extends HttpServlet {

	private static final long serialVersionUID = 23L;

}
