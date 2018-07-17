package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {3}
 * @author jether.rodrigues
 *
 * The abstract class try to override the getTailLength() method but closing the visibility
 * it is not allowed beacause the subclass cant be closer than superclass.
 * 
 * The Cougar class has a compile error beacause not implement the abstract method getTailLength()
 * to override it (that class has a overload method getTailLength(int length) but is not implement
 * the correct abstract method)
 * 
 * The abstract class never can be instantiate, e.g: new Puma() its forbidden
 */

public class Cougar extends Puma {

	public static void main(String[] args) {
		/**
		 * compile error
		 */
		//Puma puma = new Puma();
	}
	
	public int getTailLength(int length) {
		return 2;
	}

	/**
	 * need implement the abstract method getTailLength() 
	 */
	@Override
	public int getTailLength() {
		return 2;
	}

}

interface HasTail {
	int getTailLength();
}

abstract class Puma implements HasTail {
	/**
	 * compile error
	 */
	//protected int getTailLength() {
	//	return 4;
	//}
}