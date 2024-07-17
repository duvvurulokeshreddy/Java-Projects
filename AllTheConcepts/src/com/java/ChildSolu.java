package com.java;

public class ChildSolu {
	public static void main(String[] args) {
		Child cmp=new Daughter();
		System.out.println(cmp.brand+" "+cmp.colour);
		cmp.start();
		System.out.println();
		
		Daughter b=(Daughter) cmp;
		System.out.println(b.brand+b.colour+b.cost+b.fuel);
		b.Stop();
	}
}
