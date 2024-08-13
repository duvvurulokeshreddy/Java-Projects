package customException;

import java.util.Scanner;
class Atm {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int balance=5000;
	System.out.println("Enter the Amount");
	int amount =sc.nextInt();
	sc.close();
	
	if(amount<=balance) {
		System.out.println("Amount withdrawal Successfully  ");
		
	}
	else
	{
		try {
			System.out.println("Insufficient Fund");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	}

}
