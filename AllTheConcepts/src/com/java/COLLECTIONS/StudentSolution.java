package com.java.COLLECTIONS;
import java.util.*;
public class StudentSolution {
	public static void main(String[] args) {
		Student s1=new Student("Loki", 10);
		Student s2=new Student("Rahul", 40);
		
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(s2);
		l.add(s1);
		for(Student r:l) {
			System.out.println(r);
		}
	}
}
