package hirerarchical;

class Solution {

	public static void main(String[] args) {
		Car c=new Car();
		Bike b=new Bike();
		Vehicle v=new Vehicle();
		System.out.println("brand"+" "+v.brand);
		System.out.println("colour"+" "+c.colour);
		System.out.println("cost"+" "+b.cost);
		c.start();
        b.stop();
	}

}
