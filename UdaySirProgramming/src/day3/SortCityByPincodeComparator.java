package day3;

import java.util.Comparator;

public class SortCityByPincodeComparator implements Comparator<City> {

	@Override
	public int compare(City x, City y) {
		return x.pinCode-y.pinCode;
	}

}
