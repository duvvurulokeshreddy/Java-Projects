package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class EXAMPLE {
	public static void main(String[] args) {
		LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
		s.add(5);
		s.add(10);
		s.add(4);
		s.add(3);
		ArrayList<Integer> ar=new ArrayList<Integer>(s);
		//sort can accept only list type as  an arguments
		ListIterator<Integer> listIterator = ar.listIterator(ar.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			}
		
		//Collections.reverse(ar);
		
		//System.out.println(ar);
	}

}
