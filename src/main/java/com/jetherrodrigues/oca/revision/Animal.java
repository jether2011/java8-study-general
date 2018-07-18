package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {16}
 * @author jether.rodrigues
 *
 */
public interface Animal {
	public default String getName() {
		return null;
	}
}

interface Mammal {
	public default String getName() {
		return null;
	}
}
//Option-1: if remove the "default" mark and the method body
//, the abstract class Otter will compile
abstract class Otter implements Animal, Mammal {
	//Option-2: override Animal or Mammal (just from Animal or Mammal, just one method getName
	//can be override here without compile problem) default method getName()
	//in abstract class Otter, so, will compile	
	
	//	@Override
	//	public String getName() {
	//		return Animal.super.getName();
	//	}
	
	//Option-3: Override with abstract getName()
	public abstract String getName();
}
