package comm;

class Student {
	Student(int age)
	{
		
		System.out.println("age:"+age);

	}
	Student(String name){
		this(22);
		System.out.println("name :"+name);

	}
	Student(double height)
	{
		this("Loki");
		System.out.println("height :"+height);
	}

	public static void main(String[] args) {
		new Student(5.9);
	}

}
