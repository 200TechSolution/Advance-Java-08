package primitivearray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("primitivearray/spring.xml");
		
		    Student s = (Student)ap.getBean("s");
		    
		    System.out.println(s.getSid());
		    System.out.println(s.getsName());
		    String[] mono = s.getMono();
		    
		    for(int i=0;i<mono.length;i++)
		    {
		    	System.out.println(mono[i]);
		    }
		        
	}

}
