package br.com.altieres.security;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.ServletSecurity.TransportGuarantee;
import javax.servlet.http.HttpServlet;

@ServletSecurity(httpMethodConstraints = {
		@HttpMethodConstraint(value = "GET", rolesAllowed = "ADMIN"),
		@HttpMethodConstraint(value = "POST", rolesAllowed = "ADMIN", transportGuarantee = TransportGuarantee.CONFIDENTIAL) })
public class MySecondSecurity extends HttpServlet {

	private static final long serialVersionUID = 23L;

}
