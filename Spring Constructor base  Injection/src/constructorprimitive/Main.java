package constructorprimitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

     
		ApplicationContext ap=
		new ClassPathXmlApplicationContext("constructorprimitive/spring.xml");
         
		Student s =(Student) ap.getBean("s");
		
		System.out.println(s);
	}

}
