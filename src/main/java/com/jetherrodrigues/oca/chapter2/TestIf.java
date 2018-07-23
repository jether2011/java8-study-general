package com.jetherrodrigues.oca.chapter2;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestIf {

	public static void main(String[] args) {
		int x = 4;
		long y = x * 4 - x++;
		
		if(y < 10) System.out.println("Too Low");
		else System.out.println("Just right");
		//else System.out.println("Too right");
		/**
		 * This code do not compile because line 
		 * `else System.out.println("Too right");` is incorrect
		 */
	}

}
