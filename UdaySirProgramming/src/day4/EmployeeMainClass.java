package day4;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeMainClass {
	
	public static void main(String[] args) {
		Employee e1=new Employee(576.89);
		Employee e2=new Employee(59.75);
		Employee e3=new Employee(59.7);
		
		HashSet<Employee> l=new HashSet<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		Iterator<Employee> e=l.iterator();
		while(e.hasNext()) {
			Employee r=e.next();
			System.out.println("Salary "+r.salary);
		}
	}

}
