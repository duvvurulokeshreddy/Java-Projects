package comm;

abstract class Hello{
	Hello(int a){
		System.out.println("1");
		
	}
}
	class Bike extends Hello{
		Bike(){
		super(2);
		System.out.println("2");
		}
	}


