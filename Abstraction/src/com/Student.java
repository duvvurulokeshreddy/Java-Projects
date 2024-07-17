package com;

public class Student implements Comparable<Student>{
	 int sId;

	 Student(int sId) {
		this.sId = sId;
	}

	@Override
	public String toString() {
		return "sid"+sId+" Name ";
	}
	
	public int compareTo(Student x) {
		return this.sId-x.sId;
	}
	 
	

}
