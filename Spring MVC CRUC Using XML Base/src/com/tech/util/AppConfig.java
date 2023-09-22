package com.tech.util;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.tech.model.Student;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.tech")
public class AppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
	}

	@Bean
	public DriverManagerDataSource dmds() {
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/springmvc08");
		d.setUsername("root");
		d.setPassword("root");
		return d;
	}
	
	@Bean
	public LocalSessionFactoryBean sf()
	{
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(dmds());
		Properties p=new Properties();
		p.setProperty("org.hibernate.dialect.MySQL55Dialect","hibernate.dialect");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		p.setProperty("hibernate.show-sql","true");
		lsf.setHibernateProperties(p);
		lsf.setAnnotatedClasses(Student.class);
		return lsf;
	}
}
