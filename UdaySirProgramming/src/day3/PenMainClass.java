package day3;

import java.util.Iterator;
import java.util.TreeSet;

public class PenMainClass {
	
	public static void main(String[] args) {
		Pen p1=new Pen(560);
		Pen p2=new Pen(56);
		Pen p3=new Pen(6654);
		
		TreeSet<Pen> t=new TreeSet<Pen>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		
		 Iterator<Pen> p=t.iterator(); 
		 while(p.hasNext()) { 
			 Pen r=p.next();
		 System.out.println("Pen Cost is : "+r.cost); }
		 
		
//		for(Pen p:t){
//			System.out.println("Cost : "+p.cost);
//		}
		
	}

}
