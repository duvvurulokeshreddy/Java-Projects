package org;

class Employee {
	double salary;
	
	Employee (double salary)
	{
		this.salary=salary;
		
	}
	@Override
	public boolean equals(Object obj) // Object obj=new Employee(2.5);
	{
		Employee emp=(Employee) obj;//Downcasting 
		return this.salary==emp.salary;//e1.salary==e2.salary
		
	}

}

//e1.-> this & e2-> obj ->emp
