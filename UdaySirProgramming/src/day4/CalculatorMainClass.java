package day4;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Calculator cal=new CalculatorImpl();

		System.out.println("1.Addition\n2:Subtraction\n3:Multiplication");
		System.out.println("4:Division\n5:Exist");
		System.out.println("Enter The Choice");
		int choice=sc.nextInt();
		
		//since x & y are local variable ,it does not have default values 
		//hence explicitly initializing to 0
		
		int x=0;
		int y=0;
		if(choice >=1 && choice <=4) {
		System.out.println("Enter The First Number");
		 x=sc.nextInt();
		System.out.println("Enter The Second Number");
		y=sc.nextInt();
		sc.close();
		}

		switch(choice) {
		case 1:
			cal.add(x,y);
			break;
		case 2:
			cal.sub(x,y);
			break;
		case 3:
			cal.mul(x,y);
			break;
		case 4:
			cal.div(x,y);
		
			default:
			System.out.println("Invalid Choice");
		}


	}

}
