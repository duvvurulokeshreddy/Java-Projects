package day2;

import java.util.LinkedHashSet;

public class CarMainClass {
	
	public static void main(String[] args) {
		 Car c1=new Car(1000);
		 Car c2=new Car(1000);
		 Car c3=new Car(2000);
		 
		 LinkedHashSet<Car> t=new LinkedHashSet<Car>();
		 t.add(c1);
		 t.add(c2);
		 t.add(c3);
		 
		 for(Car r:t) {
			 System.out.println(r);
		 }
		 
	}

}
