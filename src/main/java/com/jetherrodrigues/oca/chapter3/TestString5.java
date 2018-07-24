package com.jetherrodrigues.oca.chapter3;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestString5 {

	public static void main(String[] args) {
		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse") System.out.println("==");
		if (a.equals("2cfalse")) System.out.println("equals");
		
		// the code will print 'equals'
	}

}
