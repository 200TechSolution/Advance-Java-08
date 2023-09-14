package com.tech;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
//		Resource r=new ClassPathResource("spring.xml");
//		
//		BeanFactory ap=new XmlBeanFactory(r);
		
		ApplicationContext ap=new  ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("After ap...");
		
		
		Welcome w= (Welcome) ap.getBean("w");
	
		
		
		
		
		 
		
		
		
	}

}
