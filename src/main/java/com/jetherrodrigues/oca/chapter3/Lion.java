package com.jetherrodrigues.oca.chapter3;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Lion {
	public void roar(String roar1, StringBuilder roar2) {
		roar1.concat("!!!");
		roar2.append("!!!");
	}
	
	public static void main(String[] args) {
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		
		new Lion().roar(roar1, roar2);
		
		System.out.println(roar1 + " " + roar2);
		
		// the code print "roar roar!!!"
		// StringBuilder is mutable so the when pass that to roar method, we pass 
		// the reference and after append, the value change... String is imutable, so do 
		// not change
	}
}
