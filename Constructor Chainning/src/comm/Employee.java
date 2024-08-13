package comm;

class Employee {
	Employee(int id)
	{
		this("tom",28);
		System.out.println("id"+id);

	}
	Employee(String name,int age)
	{
		
		System.out.println("name"+name +" "+"age"+age);

	}
	Employee(double sal)
	{
		this(101);
		System.out.println("sal"+sal);

	}
	public static void main(String[] args) {
		new Employee(2.8);
	}
}
