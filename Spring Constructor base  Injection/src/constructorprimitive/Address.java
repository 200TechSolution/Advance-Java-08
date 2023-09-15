package constructorprimitive;

public class Address {
	
	private String cityNames;

	public Address(String cityNames) {
		
		this.cityNames = cityNames;
	}

	@Override
	public String toString() {
		return "cityNames=" + cityNames ;
	}
	
	
	
	

}
