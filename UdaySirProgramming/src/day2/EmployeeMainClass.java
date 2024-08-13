package day2;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeMainClass {
	
	public static void main(String[] args) {
		
		Employee e1 =new Employee(10, "Loki");
		Employee e2 =new Employee(11, "Raju");
		Employee e3 =new Employee(13, "Anu");
		
		HashSet<Employee> r=new HashSet<>();
		r.add(e3);
		r.add(e2);
		r.add(e1);
		
		Iterator<Employee> p = r.iterator();
		while(p.hasNext()) {
			Employee c=p.next();
			System.out.println("Id : "+c.id+" "+" Name : "+c.name);
		}
	}

}
