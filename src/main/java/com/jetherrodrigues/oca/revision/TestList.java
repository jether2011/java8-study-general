package com.jetherrodrigues.oca.revision;

import java.util.ArrayList;
import java.util.List;

/**
 * Assessment test {7}
 * @author jether.rodrigues
 *
 */
public class TestList {

	public static void main(String[] args) {
		int [] a = {6,9,8};
		List<Integer> l = new ArrayList<>();
		l.add(a[0]);//index 0 = 6
		l.add(a[2]);//index 1 = 8
		l.set(1, a[1]); // now replace the value in index 1 to other, index 1 = 9
		
		l.remove(0); // remove index 0 (6)
		
		// now the list has index 0 = 9, just one element
		System.out.println(l);
	}

}
