package com.jetherrodrigues.oca.chapter3;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestString6 {

	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		
		total += letters.substring(1, 2).length(); // 2-1=1 (b)
		total += letters.substring(6, 6).length(); // 6-6=0 blank line
		total += letters.substring(6, 5).length(); // will throw exception
		  										   // StringIndexOutOfBoundsException 
												   // start > end (6 > 5)		
		
		System.out.println(total);
		
		// the code will throw an unchecked exception
	}

}
