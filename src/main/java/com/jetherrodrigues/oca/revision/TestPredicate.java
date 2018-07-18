package com.jetherrodrigues.oca.revision;

import java.util.function.Predicate;

/**
 * Assessment test {17}
 * @author jether.rodrigues
 *
 */
public class TestPredicate {

	public static void main(String[] args) {
		System.out.println(test(i -> i == 5));
		//System.out.println(test(i -> {i == 5;})); //not compile
		System.out.println(test((i) -> i == 5));
		//System.out.println(test((int i) -> i == 5)); // not compile
		//System.out.println(test((int i) -> {return i == 5;})); // not compile
		System.out.println(test((i) -> {return i == 5;}));
	}
	
	public static boolean test(Predicate<Integer> p) {
		return p.test(5);
	}
}
