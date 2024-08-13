package customException;

import java.util.Scanner;

class Solution {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Password :");
	int password =sc.nextInt();
	sc.close();
	
	if(password==123) {
		System.out.println("Login Successful !");
	}
	else
	{
		try {
			throw new InvalidPasswordException("Enter valid Password");
		}
		catch(InvalidPasswordException e) {
			System.out.println("invalid Password");
			System.out.println(e.getMessage());
		}
	}
	

	}

}
