package day4;

import java.util.ArrayList;

public class CarSolution {
	
	public static void main(String[] args) {
		ArrayList<Vehicle> t=new ArrayList<>();
		t.add(new Car());
		t.add(new Bike());
		
		for(Vehicle obj:t) {
			if(obj instanceof Car) {
				Car c=(Car) obj;
				c.drive();
			}
			else if(obj instanceof Bike) {
				Bike b=(Bike) obj;
				b.ride();
			}
		}
	}

}
