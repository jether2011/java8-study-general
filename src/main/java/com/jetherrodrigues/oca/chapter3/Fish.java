package com.jetherrodrigues.oca.chapter3;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Fish {

	public static void main(String[] args) {
		int numfish = 4;
		String fishType = "tuna";
		/**
		 * this code do not compile because the types are incompatible
		 */
		//String anotherFish = numfish + 1;
		//System.out.println(anotherFish + " " + fishType);
		System.out.println(numfish + " " + 1);
	}

}
