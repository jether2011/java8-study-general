package com.jetherrodrigues.oca.collections;

import java.util.stream.Stream;

/**
 * 
 * https://stackify.com/streams-guide-java-8/
 * 
 * @author jether
 *
 */
public class JavaStreams {
	
	private static Employee[] arrayOfEmps = {
		    new Employee(1, "Jeff Bezos", 100000.0), 
		    new Employee(2, "Bill Gates", 200000.0), 
		    new Employee(3, "Mark Zuckerberg", 300000.0)
		};
	
	public static void main(String[] args) {
		/**
		 * One way
		 */
		Stream.of(arrayOfEmps);
		
		/**
		 * Another way
		 */
		Stream.Builder<Employee> empStreamBuilder = Stream.builder();
		empStreamBuilder.accept(arrayOfEmps[0]);
		empStreamBuilder.accept(arrayOfEmps[1]);
		empStreamBuilder.accept(arrayOfEmps[2]);
		Stream<Employee> empStream = empStreamBuilder.build();
		
		empStream.forEach(e -> System.out.println(e));
	}
}
