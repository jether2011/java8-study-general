package com.jetherrodrigues.oca.chapter3;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestStringbuilder2 {

	public static void main(String[] args) {
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		//if (s1 == s2) System.out.println("1");
		// the code do not compile beacause the operands 
		// is incompatible string and stringbuilder
		if (s1.equals(s2)) System.out.println("2");
	}

}
