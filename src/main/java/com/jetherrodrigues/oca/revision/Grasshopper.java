package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {10}
 * @author jether.rodrigues
 *
 */
public class Grasshopper {
	public Grasshopper(String n) {
		name = n;
	}

	public static void main(String[] args) {
		Grasshopper one = new Grasshopper("G1");// one object in the heap
		Grasshopper two = new Grasshopper("G2");// more one object in the heap
		
		// in this moment the object Grasshopper("G1") is eligible to the GC
		// and one and two refer both to Grasshopper("G2")
		one = two; 
		
		// in this moment just one refer to Grasshopper("G2") 
		// and Grasshopper("G1") is eligible to the GC
		two = null;
		// in this moment Grasshopper("G1") and
		// Grasshopper("G2") are eligible to the GC
		one = null; 
	}
	private String name;
}
