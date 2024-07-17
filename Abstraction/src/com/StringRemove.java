package com;

import java.util.*;

public class StringRemove {
	
	public static String removeDuplicates(String input) {
		Set<Character> see=new LinkedHashSet<>();
		StringBuilder result=new StringBuilder();
		for(char c:input.toCharArray()) {
			if(!see.contains(c)) {
				see.add(c);
				result.append(c);
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String input="Duvvuru";
		String output=removeDuplicates(input);
		System.out.println(output);
	}

}
