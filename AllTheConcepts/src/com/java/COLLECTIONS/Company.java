package com.java.COLLECTIONS;

public class Company {
	public int companyId;
	public String companyName;
	
	Company(int companyId,String companyName){
		this.companyId=companyId;
		this.companyName=companyName;
	}
	public String toString() {
	return "companyId "	+companyId+" companyName "+companyName;
	}
	
}
