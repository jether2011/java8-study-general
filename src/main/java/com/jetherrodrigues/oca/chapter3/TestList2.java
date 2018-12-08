package com.jetherrodrigues.oca.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author jether
 *
 */
public class TestList2 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 4, -1, 5);
		Collections.sort(l);
		Integer a[] = l.toArray(new Integer[4]);
		System.out.println(a[0]);
		
		// the code will print -1
	}

}
