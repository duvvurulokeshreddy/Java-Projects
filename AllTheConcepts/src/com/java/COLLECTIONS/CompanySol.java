package com.java.COLLECTIONS;

import java.util.TreeSet;

public class CompanySol {
	public static void main(String[] args) {
		Company c1=new Company(151, "Tech M");
		Company c2=new Company(72, "IBM");
		Company c3=new Company(175, "TCS");
		
		SortByCompanyId p=new SortByCompanyId();
		SortByComapanyName t=new SortByComapanyName();
		TreeSet<Company> r=new TreeSet<Company>(p);
		
		r.add(c1);
		r.add(c2);
		r.add(c3);
		
		for(Company w:r) {
			System.out.println(w);
		}
	}
}
