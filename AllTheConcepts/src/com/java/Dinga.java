package com.java;

public class Dinga {
	  Dinga() {
		System.out.println("Hiii");
	}
	Dinga(int a){
		this();
		System.out.println("Guru "+a);
	}
	int a=10;
	public static void main(String[] args) {
		Dinga d=new Dinga(10);
		System.out.println(d.a);
	}
	
}
