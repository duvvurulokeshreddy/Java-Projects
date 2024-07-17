package com.java.lib;



public class Solution {

	static void div()throws Exception {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			Thread.sleep(5000);
			div();
		}
		catch (Exception e) {
			System.out.println("It is not divisible by Zero");
		}
		System.out.println("App End");
	}

}
