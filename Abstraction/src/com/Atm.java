package com;

class Atm implements Bank {// 2 rules 

	int balance=5000;
	@Override
	public void despoit(int amount)
	{
		System.out.println("Deposting Rs."+amount);
		balance=balance+amount;
		System.out.println("Amount Desposited Successfully !");
	}
	@Override
	public void withdraw(int amount)
	{
		System.out.println("Withdraw Rs."+amount);
		balance=balance-amount;
		System.out.println("Amount Withdraw Successfully ");
	}
	public void checkBalance()
	{
		System.out.println("Display the amount Rs "+balance);
	}

}
