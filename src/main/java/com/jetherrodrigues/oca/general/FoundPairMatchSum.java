package com.jetherrodrigues.oca.general;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether.rodrigues - 2018/12/08
 *
 * These program has a method (hasPairToMatchSum) receive a array 
 * to search a pair of value to match a Sum value
 * 
 * Requirements:
 *  - The array can has negative number
 *  - The method needs receive the array and sum
 */
public class FoundPairMatchSum {

	public static void main(String[] args) {
		int[] array = { -1, 3, 6, 9, 5 };
		int sumToMatch = 8;
		
		hasPairToMatchSum(array, sumToMatch);
	}
	
	private static void hasPairToMatchSum(int[] toSearch, int sumToMatch) {
		List<Integer> convertedToSearch = new ArrayList<>();
		for (int i : toSearch) {
			convertedToSearch.add(i);
		}
		
		for (int i = 0;  i < convertedToSearch.size(); i++) {
			int obj = convertedToSearch.get(i);
			if(i < sumToMatch) {
				int to = sumToMatch - obj;
				boolean founded = convertedToSearch.contains(to);
				
				if (founded) {
					System.out.println(String.format("{ \n\t\"sum\": %d,\n"
							+ "\t\"value\": %d, \n"
							+ "\t\"position-value\": %d, \n"
							+ "\t\"diff\": %d, \n"
							+ "\t\"position-diff\": %d, \n"
							+ "\t\"founded\": %b \n }"
							, sumToMatch, obj, i, to, convertedToSearch.indexOf(to), founded));
					break;
				}
			}
		}
	}
}
