package com.jetherrodrigues.oca.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether
 *
 */
public class TestList5 {

	public static void main(String[] args) {
		List<String> one = new ArrayList<String>();
		List<String> two = new ArrayList<>();
		
		one.add("abc");
		two.add("abc");
		
		if(one == two) System.out.println("A");
		else if(one.equals(two)) System.out.println("B");
		else System.out.println("C");
		
		//ArrayList override "equals", so will compare values and the code will print B
	}

}
