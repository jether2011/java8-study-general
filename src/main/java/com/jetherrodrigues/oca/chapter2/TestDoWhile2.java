package com.jetherrodrigues.oca.chapter2;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestDoWhile2 {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int result = 15, i = 10;
		do {
			i--;
			if(i == 8 ) keepGoing = false;
			result -= 2;
		} while (keepGoing); 
		// the code print 11
		System.out.println(result);
	}
}
