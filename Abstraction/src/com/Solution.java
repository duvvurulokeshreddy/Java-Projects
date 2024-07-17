package com;

import java.util.Set;
import java.util.TreeMap;

public class Solution {
	
	public static void main(String[] args) {
		Student s1=new Student(10);
		Student s2=new Student(20);
		
		TreeMap<Student, String> t=new TreeMap<Student, String>();
		t.put(s1, "Loki");
		t.put(s2,"Raju");
		
		Set<Student> p=t.keySet();
		for(Student s:p) {
			System.out.println(s+" "+t.get(s));
		}
	}

}
