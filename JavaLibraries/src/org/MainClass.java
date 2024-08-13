package org;

class MainClass {
	public static void main(String[] args) {
		Employee e1=new Employee(2.5);
		Employee e2=new Employee(2.5);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(new Employee (2.5)));
		
		if(e1.equals(e2)) {
			System.out.println("Salary is same");
		}
		else
		{
			System.out.println("Salary is Different");
		}
	}

}
