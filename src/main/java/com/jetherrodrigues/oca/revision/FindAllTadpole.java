package com.jetherrodrigues.oca.revision;

import java.util.ArrayList;
import java.util.List;

/**
 * Assessment test {15}
 * @author jether.rodrigues
 *
 */
interface CanSwin {}
class Amphibian implements CanSwin {}
class Tadpole extends Amphibian {}
// Amphibian is-a CanSwin
// Tadpole is-a Amphibian and CanSwin
// All classes is-a Object
public class FindAllTadpole {

	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<>();
		for (Amphibian amphibian : tadpoles) {
			//One Tadpole object can be: Amphibian, CanSwin, Object 
			Amphibian tadpole = amphibian;
			CanSwin tadpoleInterface = amphibian;
			Object tadpoleObj = amphibian;
			
			/**
			 * this case not compile because need a cast like (Tadpole)amphibian
			 */
			//Tadpole tadpole2 = amphibian; 
		}
	}

}
