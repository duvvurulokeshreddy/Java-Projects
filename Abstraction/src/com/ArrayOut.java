package com;


public class ArrayOut {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		try {
			int values=array[10];
			System.out.println("values is not present");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught"+e);
			System.out.println("invalid Exception");
		}
		
	}
}
