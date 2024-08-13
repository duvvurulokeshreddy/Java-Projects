package day3;

public class Movie implements Comparable<Movie>{
	
	String name;
	double collection;
	public Movie(String name, double collection) {
		this.name = name;
		this.collection = collection;
	}
	@Override
	public int compareTo(Movie p) {
		return this.name.compareTo(p.name);
	}
	
	

}
