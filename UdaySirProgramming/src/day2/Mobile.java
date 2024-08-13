package day2;

public class Mobile {

	String brand;
	int cost;
	public Mobile(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}
	
	public int hashCode() {
		return brand.hashCode(); //maintaining brand uniqueness
	}
	
	public boolean equals(Object obj) {				// Object obj=new Mobile("Apple" 200);
		if(obj instanceof Mobile) {					// avoiding ClassCastException
			return this.brand.equals(brand);		// downCasting  comparison based on brand
		}
		return false;								// returning false for else scenario
	}
	
}
