package day4;

public class Employee {
	
	double salary;

	public Employee(double salary) {
		this.salary = salary;
	}
	
	public int hashCode() {
		Double s=salary;
		return s.hashCode();
		
//		return ((Double)salary).hashCode();
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Employee) {
			Employee e=(Employee) obj;
			return this.salary==e.salary;
			
//			return ((Double)((Employee)obj).salary).equals(this.salary);
		}
		return false;
	}

}
