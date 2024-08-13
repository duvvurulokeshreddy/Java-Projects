package day3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class CityMainClass {
	
	public static void main(String[] args) {
		
		City c1=new City("Bangalore", 560050);
		City c2=new City("Nellore", 524129);
		City c3=new City("Naidupeta",524126);
		
//		SortCityByNameComparator name=new SortCityByNameComparator();
		SortCityByPincodeComparator pincode=new SortCityByPincodeComparator();
		TreeMap<City, String> t=new TreeMap<City, String>(pincode);
		t.put(c1, "india");
		t.put(c2, "Usa");
		t.put(c3, "New York");
		
		Set<City> keys=t.keySet();
		
//		for(City r:keys) {
//			System.out.println(r.name+" "+r.pinCode);
//		}
		
		Iterator<City> l=keys.iterator();
		while(l.hasNext()) {
			City c=l.next();
			System.out.println(c.name+" "+c.pinCode);
		}
		
		
	}

}
