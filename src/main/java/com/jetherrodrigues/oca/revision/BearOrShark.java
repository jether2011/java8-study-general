package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {13}
 * @author jether.rodrigues
 *
 */
public class BearOrShark {

	public static void main(String[] args) {
		int luck = 10;
		// using the ternary conditional and pre and pos increment
		if((luck > 10 ? luck++ : --luck) < 10) {
			System.out.print("Bear");
		}
		if(luck < 10) {
			System.out.print("Shark");
		}
	}

}
