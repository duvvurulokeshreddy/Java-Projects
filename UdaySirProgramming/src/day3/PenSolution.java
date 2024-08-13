package day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PenSolution {
	
	public static void main(String[] args) {
		
		Pen p1=new Pen(560);
		Pen p2=new Pen(56);
		Pen p3=new Pen(6654);
		
		ArrayList<Pen> t=new ArrayList<Pen>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		Collections.sort(t);
		
		 Iterator<Pen> p=t.iterator();
		 while(p.hasNext()) {
			 Pen r=p.next();
			 System.out.println("Pen Cost is : "+r.cost);
		 }
	}

}
