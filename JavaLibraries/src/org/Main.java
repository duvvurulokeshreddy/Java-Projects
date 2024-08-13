package org;

class Main {

	public static void main(String[] args) {
		Car c1=new Car(2,"Hello");
		Car c2=new Car(2,"Hello");
		
		System.out.println(c1.equals(c2));
//		System.out.println(c1.equals(new Car(2,"Hello")));
//		
//		if(c1.equals(c2)) {
//			System.out.println("cost & Brand are Same");
//		}
//		else
//		{
//			System.out.println("Cost & brand are different");
//		}
		System.out.println(c1.equals(c2));
	}

}
