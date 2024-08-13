package customException;

import java.util.Scanner;
class Amazon {
	
	static void checkEligibility(int percentage)throws InvalidPercentageException{
		if(percentage >60 && percentage <=100) {
			System.out.println("Apply the interview");
			
		}
		else {
			throw new InvalidPercentageException("not eligible for amazon");
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the percentage");
	int percentage=sc.nextInt();
	try {
	checkEligibility(percentage);
	}
	catch(InvalidPercentageException e) {
		System.out.println(e.getMessage());
	}
	
	}

}
