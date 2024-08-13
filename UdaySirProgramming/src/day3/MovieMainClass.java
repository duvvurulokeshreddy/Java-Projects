package day3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MovieMainClass {
	
	public static void main(String[] args) {
		Movie m1=new Movie("RRR",765656.6);
		Movie m2=new Movie("KGF",545.987);
		Movie m3=new Movie("Lovers",234.89);
		
		SortByMovieName name=new SortByMovieName();
		
		TreeMap<Movie,String> r=new TreeMap<>(name);
		r.put(m1, "Telugu");
		r.put(m2, "English");
		r.put(m3, "Tamil");
		
		
		
		Set<Movie> keySet = r.keySet();
		
		Iterator<Movie> y=keySet.iterator();
		while(y.hasNext()) {
			Movie n=y.next();
			System.out.println(n.name+" "+"Movie Collected "+n.collection+" cross & was released in "+r.get(n));
		}
		
//		for(Movie key:keySet) {
//			System.out.println(key.name+" "+"Movie Collected "+key.collection+" cross & was released in "+r.get(key));
//		}
		
	}

}
