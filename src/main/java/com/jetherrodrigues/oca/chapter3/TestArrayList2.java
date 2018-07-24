package com.jetherrodrigues.oca.chapter3;

import java.util.ArrayList;

/**
 * 
 * @author jether
 *
 */
public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> c = new ArrayList<>();
		c.add(4);
		c.add(5);
		
		c.set(1, 6);
		c.remove(0);
		
		for (Integer i : c) {
			System.out.println(i);
		}		
	}
	// this code will print 6
}
