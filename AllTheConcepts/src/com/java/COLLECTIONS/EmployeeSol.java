package com.java.COLLECTIONS;

import java.util.*;

public class EmployeeSol {

	public static void main(String[] args) {
		Employee e1=new Employee(101);
		Employee e2=new Employee(158);
		Employee e3=new Employee(75);
		
		ArrayList <Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e3);
		al.add(e2);
		
		Collections.sort(al);
		for(Employee p:al) {
			System.out.println(p);
		}
	}
}
