package day2;

public class Car {

	int carCost;

	public Car(int carCost) {
		this.carCost = carCost;
	}

	@Override
	public String toString() {
		return "Car [carCost=" + carCost + "]";
	}
	@Override
	public int hashCode() {
		return carCost; 					// Maintaining cost uniqueness
	}
	@Override
	public boolean equals(Object obj) {      // upCasting  -> Object obj=new Car(100);
		if(obj instanceof Car) {			 // avoiding ClassCastException
			Car c=(Car)obj;					 // downCasting
			return this.carCost==c.carCost;	 // comparison logic based on cost
		}
		return false;						 // returning false for else scenario
	}
	
	
}
