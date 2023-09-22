package com.tech.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initilizer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		AnnotationConfigWebApplicationContext awp=new AnnotationConfigWebApplicationContext();
		awp.register(AppConfig.class);
		awp.setServletContext(sc);
		ServletRegistration.Dynamic sdy=sc.addServlet("DispatcherServlet", new DispatcherServlet(awp));
		sdy.addMapping("/");
		
	}

}
