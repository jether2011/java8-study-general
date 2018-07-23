package com.jetherrodrigues.oca.chapter2;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestCast {

	public static void main(String[] args) {
		//short x = 10; - OK
		long x = 10;
		
		//short y =  2 * x; - Not Compile
		
		long y =  2 * x; //- OK
		//int y =  2 * x; //- OK
		//int y =  2 * (int)x; //- OK
		//int y = (int) (2 * x); //- OK
	}

}
