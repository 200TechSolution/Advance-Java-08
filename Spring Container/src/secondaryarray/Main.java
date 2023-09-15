package secondaryarray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
 ApplicationContext ap=new ClassPathXmlApplicationContext("secondaryarray/spring.xml");
		
   Student s=(Student)ap.getBean("s");
   
   System.out.println(s.getSid());
   System.out.println(s.getSname());
        Address[] address = s.getAddress();
        
        for(int i=0;i<address.length;i++)
        {
        	System.out.println(address[i].getCitys());
        }
	}
	

}
