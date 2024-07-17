package com.java.COLLECTIONS;
import java.util.*;
public class SortByCompanyId implements Comparator<Company>{
	public int compare(Company x,Company y) {
		return x.companyId-y.companyId;
	}
}
