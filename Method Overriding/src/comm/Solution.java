package comm;

class Employee
{
	void work()
	{
		System.out.println("Working");
	}
}
	class Developers extends Employee
	{
		@Override
		void work ()
		{
			System.out.println("Develpoing the app");
		}
	}
	class Tester extends Employee
	{
		@Override
		void work ()
		{
			System.out.println("Testing");
		}
	}


class Solution {

	public static void main(String[] args) {
		Developers d=new Developers();
		d.work();
		System.out.println("===");
		Tester t=new Tester();
		t.work();
	}
}

