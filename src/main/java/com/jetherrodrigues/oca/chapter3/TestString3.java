package com.jetherrodrigues.oca.chapter3;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestString3 {

	public static void main(String[] args) {
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));
		
		// the code will print 12 and after index 1 to index 2 (1,3) [3 - 1 = 2]
		// the code will print " " and after index 7 to index 7 (7,7) [7 - 7 = 0]
		// the code will print 78 and after index 7 until to end
	}

}
