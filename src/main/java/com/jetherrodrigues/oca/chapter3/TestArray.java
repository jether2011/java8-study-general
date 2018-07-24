package com.jetherrodrigues.oca.chapter3;

import java.util.Arrays;

/**
 * 
 * @author jether
 *
 */
public class TestArray {

	public static void main(String[] args) {
		int[] r = {6, -4, 12, 0, -10};
		int x = 12;
		int y = Arrays.binarySearch(r, x);
		System.out.println(y);
	}
}
