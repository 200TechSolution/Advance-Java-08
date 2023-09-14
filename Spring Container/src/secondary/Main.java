package secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

             ApplicationContext ap=
             new ClassPathXmlApplicationContext("secondary/spring.xml");
             
             Student stu =(Student) ap.getBean("s");
           
             System.out.println(stu.getSid());
             System.out.println(stu.getsName());
             System.out.println(stu.getAddress().getAreaName());
             System.out.println(stu.getAddress().getCityName());
	}

}
