package rtp;

class Employee
{
	void work()
	{
		System.out.println("Employee is Working");
	}
}

class Developer extends Employee{//rule 1
	@Override

	void work()//rule 2
	{
		System.out.println("Developing App");

	}
}
class Tester extends Employee //rule 1
{
	void work()//rule 2
	{
		System.out.println("Testing App");
	}
}

class Solution {

	//Employee obj=new Developer() or new Tester();
	static void display(Employee obj)
	{
		obj.work();
	}

	public static void main(String[] args) {
		//1.Upcasting using method
		display(new Developer());
		display(new Tester());
		
		System.out.println("---------------");
		
		//2.Upcasting using Seperate reference variable
		Employee e1=new Developer();
		e1.work();
		Employee e2=new Tester();
		e2.work();
		
		System.out.println("-----------------");

		//3.Upcasting using single Reference
		Employee emp;
		emp=new Developer();
		emp.work();
		emp=new Tester();
		emp.work();
	}

}
