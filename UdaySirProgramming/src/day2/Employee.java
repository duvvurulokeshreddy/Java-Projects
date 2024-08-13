package day2;

public class Employee {
	
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int hashCode() {
		return id;  // -> For maintaining id uniqueness
//		return name.hashCode(); For maintaining name uniqueness
		
	}
	
	public boolean equals(Object obj) { // Object obj =new Employee(100,"A");
		
		if(obj instanceof Employee) {
			Employee e=(Employee) obj;
			return this.id==e.id;
//			return this.name.equals(e.name); 
		}
		
		return false;
		
	}

}
