package com.java.COLLECTIONS;
import java.lang.Comparable;
public class Employee implements Comparable<Employee> {
	public int employeeId;
	
	Employee(int employeeId){
		this.employeeId=employeeId;
	}
	public String toString() {
		return "EmployeeId "+employeeId;
	}
	 public int compareTo(Employee e) {
		 return this.employeeId -e.employeeId;
	 }
}
