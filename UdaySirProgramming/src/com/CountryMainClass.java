package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CountryMainClass {

	public static void main(String[] args) {
		Country c=new Country("India",4356789);
		Country t=new Country("USA", 765643);
		
		 List<Country> p=new ArrayList<>();
		 p.add(c);
		 p.add(t);
		 
		 //Iterator -> Cursor ->Forward
		 Iterator<Country> i = p.iterator();
		 while(i.hasNext()) {
			 Country cr=i.next();
			 System.out.println(cr.name+" "+cr.population);
		 }
		 
		 System.out.println(" --------- ");
		 
		 //ListIterator -> Cursor ->Forward &Backward
		 ListIterator<Country> itr=p.listIterator();
		 while(itr.hasNext()) {
			 Country cr=itr.next();
			 System.out.println(cr.name+" "+cr.population);
		 }
		 
		 System.out.println(" -------------- ");
		 
		 while(itr.hasPrevious()) {
			 Country cr=itr.previous();
			 System.out.println(cr.name+" "+cr.population);
		 }
		 
		 // ListIterator -> Cursor -> Forward&Backward
		 //we are traversing only in backward direction using ListIterator
		 System.out.println("--------------");
		 
		 
		 ListIterator<Country> u=p.listIterator(p.size());
		 while(u.hasPrevious()) {
			 Country cr=u.previous();
			 System.out.println(cr.name+" "+cr.population);
		 }
		 
	}
}
