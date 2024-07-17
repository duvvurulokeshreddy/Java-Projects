package com.java.COLLECTIONS;

public class Student {
	public String studentName;
	public int age;
	public Student(String studentName, int age) {
		this.studentName = studentName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", age=" + age + "]";
	}
	
}
