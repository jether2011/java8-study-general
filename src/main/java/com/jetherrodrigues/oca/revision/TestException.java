package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {5}
 * @author jether.rodrigues
 *
 * The final value printed out is: abcde. 
 * Inside the try statement is throw a RuntimeException (IllegalArgumentException)
 * caught in catch statement (can be expected RuntimeException and Exception - RuntimeException
 * extends Exception) and always the finally block is executed 
 */
public class TestException {

	public static void main(String[] args) {
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			System.out.print("c");
		} finally {
			System.out.print("d");
		}
		System.out.print("e");
	}

}
