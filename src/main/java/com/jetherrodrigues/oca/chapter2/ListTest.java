package com.jetherrodrigues.oca.chapter2;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class ListTest {

	static java.util.List<Integer> list = new java.util.ArrayList<Integer>();
	
	public static void main(String[] args) {
		list.add(10);
		list.add(14);
		
		for (int x : list) {
			System.out.print(x + ", ");
			break;
		}
		
		/**
		 * This code print just `10,` because the statement `break` stop the loop 
		 */
	}

}
