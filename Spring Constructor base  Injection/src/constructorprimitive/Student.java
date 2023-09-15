package constructorprimitive;

import java.util.Arrays;

public class Student {
	
	private int sid;
	
	private String sname;

	private Address[] address;

	public Student(int sid, String sname, Address[] address) {
	
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student :sid=" + sid + ", sname=" + sname + ", address:" + Arrays.toString(address) ;
	}
	
 
	
	
}
