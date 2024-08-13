package day2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MobileMainClass {
	
	public static void main(String[] args) {
		 Mobile m1=new Mobile("Realme",456);
		 Mobile m2=new Mobile("mi",3445);
		 Mobile m3=new Mobile("poco",789);
		 Mobile m4=new Mobile("Realme",44678);
		 
		 LinkedHashSet<Mobile> t=new LinkedHashSet<>();
		 t.add(m1);
		 t.add(m2);
		 t.add(m3);
		 t.add(m4);
		 
		Iterator<Mobile> p= t.iterator();
		while(p.hasNext()) {
			Mobile m=p.next();
			System.out.println("Brand : "+m.brand+" Cost : "+m.cost);
		}
		 
	}

}
