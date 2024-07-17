package com.java;

public class Country {
	public String countryName;
	public int countryPopulation;
	public String countryPm;

	Country(String countryName){
		this.countryName=countryName;
	}
	Country(String countryName,int countryPopulation){
		//this(countryName);
		this.countryPopulation=countryPopulation;
	}
	Country(String countryName,int countryPopulation,String countryPm){
		this(countryName,countryPopulation);
		this.countryPm=countryPm;
	}
	public static void main(String[] args) {
		Country c=new Country("Inda",1500000, "Modi");
		System.out.println(c.countryPm);
		System.out.println(c.countryName);
		System.out.println(c.countryPopulation);
	}
}
