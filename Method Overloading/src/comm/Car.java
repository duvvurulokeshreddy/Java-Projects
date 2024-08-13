package comm;

class Car {
	void start(int howmanyyear) {
		System.out.println("howmanyyear "+howmanyyear);
	}
	void start(String colour) {
		System.out.println("Colour "+colour);
	}
	void start(int cost,int money,String name){
		System.out.println("Cost "+cost+" money "+money+" name "+name);
	}

}
