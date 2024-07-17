package com.java.Exception;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Age");
		int age=sc.nextInt();
		if(age>=21) {
			System.out.println("Sad Life");
		}
		else {
			try {
				throw new AgeInvalidException("Happy");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
	}
}
