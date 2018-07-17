package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {2}
 * @author jether.rodrigues
 * 
 * true is printed out exactly three times
 */
public class TestReferenceOfObject {
	private static String s1 = "Java";
	private static String s2 = "Java";
	
	private static StringBuilder sb1 = new StringBuilder();
	static {
		sb1.append("Ja").append("va");
	}
	
	public static void main(String[] args) {
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(sb1.toString() == s1); //false
		System.out.println(sb1.toString().equals(s2)); //true
	}
}
