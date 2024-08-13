package day4;

public class MobileApp {

}

class Swiggy extends MobileApp{

	void orderFood()
	{
		System.out.println("The order is chicken ");
	}
}

class Uber extends MobileApp {

	void bookCab() {
		System.out.println("Booking the cab");
	}
}

class PhonePay  extends MobileApp{
	
	void payAmount() {
		System.out.println("The Amount is 1500");
	}

}
