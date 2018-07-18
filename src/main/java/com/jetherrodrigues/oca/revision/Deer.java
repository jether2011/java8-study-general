package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {8}
 * @author jether.rodrigues
 *
 */
public class Deer {
	
	public Deer() {
		System.out.print("Deer");
	}

	public Deer(int age) {
		System.out.print("DeerAge");
	}

	private boolean hasHorns() {
		return false;
	}
	
	public static void main(String[] args) {
		// the Deer class not know the Reindeer public boolean hasHorns() method, 
		// the reference is from Deer, so, the private boolean hasHorns() is called
		Deer d = new Reindeer(5);
		System.out.print(", " + d.hasHorns());
	}

}

class Reindeer extends Deer {
	public Reindeer(int age) {
		//implicit has a call to super() here in this line - The JVM put it
		System.out.print("Reeinder");
	}
	
	public boolean hasHorns() {
		return true;
	}
}
