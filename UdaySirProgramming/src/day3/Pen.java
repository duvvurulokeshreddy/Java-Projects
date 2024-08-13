package day3;

public class Pen implements Comparable<Pen>{
	
	int cost;
	public Pen( int cost) {
		this.cost = cost;
	}
	@Override
	public int compareTo(Pen p) {
		return this.cost-p.cost;				// return p.cost-this.cost;
	}
	

	
	

}
