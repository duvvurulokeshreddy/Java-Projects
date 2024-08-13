package day4;

public class CalculatorImpl  implements Calculator{

	@Override
	public void add(int x, int y) {
		System.out.println("Addition of "+x+" & "+y+" is "+(x+y));
		
	}

	@Override
	public void sub(int x, int y) {
		System.out.println("Difference of "+x+" & "+y+" is "+(x-y));
		
	}

	@Override
	public void mul(int x, int y) {
		System.out.println("Multiplication of "+x+" & "+y+" is "+(x*y));
		
	}

	@Override
	public void div(int x, int y) {
		System.out.println("Divided of "+x+" & "+y+" is "+(x/y));
		
	}

}
