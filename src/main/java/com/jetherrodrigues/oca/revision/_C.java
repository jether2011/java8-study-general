package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {1}
 * @author jether.rodrigues
 *
 * Compile error on 14: local variable need be initialize before to use it
 */
public class _C {
	private static int $;
	public static void main(String[] args) {
		/**
		 * the variable need be initialize
		 */
		String a_b;
		System.out.println($);
		//System.out.println(a_b);
	}
}
