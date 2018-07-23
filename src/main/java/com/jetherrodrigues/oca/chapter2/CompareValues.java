package com.jetherrodrigues.oca.chapter2;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class CompareValues {

	public static void main(String[] args) {
		int x = 0;
		while(x++ < 10) {}
		
		/**
		 * this code not compile because boolean false value can't be 
		 * assigned to String attribute
		 */
//		String message = x > 10 ? "Greater than" : false;
//		System.out.println(message + "," + x);
	}

}
