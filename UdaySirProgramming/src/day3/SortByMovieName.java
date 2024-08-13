package day3;

import java.util.Comparator;

public class SortByMovieName implements Comparator<Movie> {

	@Override
	public int compare(Movie x, Movie y) {
		return x.name.compareTo(y.name);
	}
	
	

}
