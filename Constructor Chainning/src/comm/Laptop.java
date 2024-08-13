package comm;


class Laptop {

	String name;
	int cost;
	Laptop(String name,int cost)
	{
		this.name=name;
		this.cost=cost;

	}

	public static void main(String[] args) {
		Laptop l1=new Laptop("hp",25000);
		Laptop l2=new Laptop("Dell",35000);
		System.out.println("cost of"+l1.name+" "+"laptop is rs :"+l1.cost);
		System.out.println("cost of"+l2.name+" "+"laptop is rs :"+l2.cost);

	}

}
