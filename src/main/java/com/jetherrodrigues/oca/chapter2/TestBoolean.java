package com.jetherrodrigues.oca.chapter2;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestBoolean {

	public static void main(String[] args) {
		boolean x = true, z = true;
		int y = 20;
		
		x = (y != 10 ) ^ (z = false);
		System.out.println(x + ", " + y + ", " + z);
	}

}
