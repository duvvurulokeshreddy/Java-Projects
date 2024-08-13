package threadPriorties;

import java.util.*;
import java.util.Collections;

public class hii {
	
	public static void main(String[] args) {
	LinkedHashSet<Integer> t=new LinkedHashSet<Integer>();
	t.add(5);
	t.add(10);
	t.add(7);

	ArrayList<Integer> w=new ArrayList<Integer>(t);
	Collections.reverse(w);
	for(Integer r:w) {
		System.out.println(r);
	}
	}
}
