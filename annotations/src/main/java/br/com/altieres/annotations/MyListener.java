package br.com.altieres.annotations;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("My Listener - Context Initialized");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("My Listener - Context Destroyed");
	}

}
