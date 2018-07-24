package com.jetherrodrigues.oca.chapter3;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestStringbuilder5 {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("Java");		
		a.reverse();		
		System.out.println(a);
		
		StringBuilder b = new StringBuilder("Java");		
		b.append("vaJ$").substring(0,4);		
		System.out.println(b);
		
		StringBuilder c = new StringBuilder("Java");		
		c.append("vaJ$").delete(0,3).deleteCharAt(c.length() - 1);		
		System.out.println(c);
		
		StringBuilder d = new StringBuilder("Java");		
		d.append("vaJ$").delete(0,3).deleteCharAt(d.length());		
		System.out.println(d);
	}	
}
