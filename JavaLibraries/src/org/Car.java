package org;

class Car {
	int cost;
	String brand;
	Car(int cost,String brand)
	{
		this.brand=brand;
		this.cost=cost;
	}
		public boolean equals(Object obj) 
		{
			Car c=(Car) obj;
			return this.cost==c.cost && this.brand==c.brand;
			
	}

}
