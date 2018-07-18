package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {6}
 * @author jether.rodrigues
 * 
 * The primitive variable not changed when pass into a method like this, 
 * so the value keeping the same initialized
 */
public class MathFunctions {
	public static void addToInt(int x, int amountToAdd) {
		x = x + amountToAdd;
	}
	public static void main(String[] args) {
		int a = 15, b = 10;
		MathFunctions.addToInt(a, b);
		System.out.println(a);
	}

}
