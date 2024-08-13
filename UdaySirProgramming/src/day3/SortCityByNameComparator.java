package day3;

import java.util.Comparator;

public class SortCityByNameComparator implements Comparator<City>{

	@Override
	public int compare(City x, City y) {
		return x.name.compareTo(y.name);
	}

}
