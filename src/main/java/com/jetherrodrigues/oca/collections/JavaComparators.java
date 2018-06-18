package com.jetherrodrigues.oca.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 *  
 * @author jether
 *
 */
public class JavaComparators {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Jether", "Luiz", "André", "Fabio");

		/**
		 * Old way
		 */
		sortOldWay(words);
		words.forEach(w -> System.out.println(w));

		/**
		 * New way in java 8
		 */
		sortNewWay(words);
		words.forEach(w -> System.out.println(w));
		
		/**
		 * New way more intuitive
		 */
		sortNewWayIntuitive(words);
		words.forEach(w -> System.out.println(w));
	}

	/**
	 * Old way
	 * 
	 * @param words
	 */
	public static void sortOldWay(final List<String> words) {
		words.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s2.length() == s1.length()) {
					return s1.compareTo(s2);
				} else {
					return s2.length() - s1.length();
				}
			}
		});
	}

	/**
	 * New way
	 * 
	 * @param words
	 */
	public static void sortNewWay(final List<String> words) {
		words.sort(Comparator.comparing(String::length)
				.thenComparing(Comparator.reverseOrder())
				.reversed());
	}

	/**
	 * New way more intuitive
	 * 
	 * @param words
	 */
	public static void sortNewWayIntuitive(final List<String> words) {
		final Function<String, Integer> byLength = s -> s.length();
		words.sort(Comparator.comparing(byLength)
				.thenComparing(Comparator.reverseOrder())
				.reversed());
	}

}
