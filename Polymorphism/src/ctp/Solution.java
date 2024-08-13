package ctp;

class Myntra {
	void buy (String name)
	{
		System.out.println("Name"+" " +name);
	}
	void buy(int cost)
	{
		System.out.println("Cost"+" " +cost);

	}
	void buy(String name,int cost)
	{
		System.out.println("Name"+" "+name+" "+"cost"+" "+cost);
	}
	void buy(int cost,String name)
	{
		System.out.println("Cost"+" "+cost+" "+"name"+" "+name);
	}
}
class Solution {
	public static void main(String[] args) {
		Myntra m=new Myntra();
		m.buy(29);
		m.buy("Earphone");
		m.buy("Cloths",50000);
		m.buy(2000,"Head phone");

	}

}
