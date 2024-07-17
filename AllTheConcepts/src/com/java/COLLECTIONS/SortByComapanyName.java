package com.java.COLLECTIONS;

import java.util.*;
 
public class SortByComapanyName implements Comparator<Company> {
	public int compare(Company x,Company y) {
		return x.companyName.compareTo(y.companyName);
	}

}
