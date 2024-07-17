package com;

class Customer {

	public static void main(String[] args) {

		Bank b=new Atm();
		b.checkBalance();
		System.out.println("=====================");
		b.despoit(500);
		b.checkBalance();
		System.out.println("======================");
		b.withdraw(200);
		b.checkBalance();

		System.out.println("======================");
		
		Atm obj=new Atm();
		obj.checkBalance();
		System.out.println("======================");
		
		obj.despoit(2000);
		obj.checkBalance();
		System.out.println("======================");
		
		obj.withdraw(200);
		obj.checkBalance();
		System.out.println("======================");

	}

}















































