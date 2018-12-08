package com.jetherrodrigues.oca.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether
 *
 */
public class TestList4 {

	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		
		for(int age: ages) System.out.println(age);
		
		// the code will print -1
	}

}
