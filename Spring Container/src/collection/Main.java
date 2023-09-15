package collection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


		ApplicationContext ap=
			new ClassPathXmlApplicationContext("collection/spring.xml");
		
	MyCollections mc=(MyCollections)ap.getBean("c");
	
	System.out.println(mc.getMyList());
	
	 List myList = mc.getMyList();
	  myList.forEach(MyCollections->System.out.println(MyCollections));
	  
	System.out.println(mc.getMySet());
	System.out.println(mc.getMyMap());
	
	
	
	}

}
