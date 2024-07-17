package com.java.lib;

public class Dinga {
	 Dinga(){
		this(10);
		System.out.println("First Data");
	}
	 
	 Dinga(int a){
		System.out.println("Second");
	}
	public static void main(String[] args) {
		Dinga d=new Dinga();
	}
}
