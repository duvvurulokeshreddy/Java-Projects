package comm;

import java.util.Scanner;

class Demo {
	static void checkPasOrNeg(int num)
	{
		if (num>0) {
			System.out.println(num +"is a postive!");
			
		}
		else {
			System.out.println(num +"is a negative");
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("enter the number :");
			int num=sc.nextInt();
			checkPasOrNeg(num);
			System.out.println("-----");
			
		}
	}
	

}
