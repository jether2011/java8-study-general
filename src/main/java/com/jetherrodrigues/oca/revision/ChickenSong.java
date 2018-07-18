package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {14}
 * @author jether.rodrigues
 *
 */
public class ChickenSong {

	public static void main(String[] args) {
		/**
		 * Assuming the "HenHouse house = ___________" is not null, 
		 * the code compile and:
		 * 1. print once "Cluck" if the house.getChickens() has one element
		 * 2. print more than once "Cluck" if the house.getChickens() has more than one element
		 * 3. throw RuntimeException (IndexOutOfBounds) if the house.getChickens() has
		 *    zero element
		 */
//		HenHouse house = ___________;
//		Chicken chicken = house.getChickens().get(0);
//		for (int i = 0; i < house.getChickens().size();
//			chicken = house.getChickens().get(i++)) {
//			System.out.println("Cluck");
//		}
	}

}

class Chicken {
	
}

interface HenHouse {
	public java.util.List<Chicken> getChickens();
}