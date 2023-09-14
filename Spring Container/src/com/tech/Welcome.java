package com.tech;

import java.util.Optional;



public class Welcome {

	String name;
	
	public static Optional<String>getName()
	{
		String name=null;
		
		return Optional.ofNullable(name);
	}
	
	
	public static void main(String[] args) {
		
//		
//		String s=null;
//		
//	Optional<String> optional = Optional.ofNullable(s);
//	  System.out.println(optional.isPresent());
//	
//	  System.out.println(optional.orElse("No value is present in this Object"));
//	  
		
		Optional<String> nameop= getName();
		System.out.println(nameop.orElse("Null Object Return"));
	}
}
