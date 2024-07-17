package com.java.COLLECTIONS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Solution {
	public static void main(String[] args) {
	HashMap<Integer,String> t=new HashMap<Integer,String>();
	t.put(1,"venky");
	Collection<String> c=t.values();
	System.out.println(c);
	for(int i=c.size()-1;i>=0;i++) {
		System.out.println(i);
//	ArrayList<String> a=new ArrayList<String>(c);
//	Collections.reverse(a);
		
	}
	
	
//	ArrayList a=new ArrayList(c);
//	Collec
	}
}
