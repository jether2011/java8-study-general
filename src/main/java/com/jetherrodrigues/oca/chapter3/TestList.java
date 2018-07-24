package com.jetherrodrigues.oca.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether
 *
 */
public class TestList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("one");
		l.add("two");
		//l.add(7);
		
		// the code do not compile because the line "l.add(7);" the type is incompatible
	}

}
