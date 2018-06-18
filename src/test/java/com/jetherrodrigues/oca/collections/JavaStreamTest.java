package com.jetherrodrigues.oca.collections;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author jether
 *
 */
public class JavaStreamTest {
		
	private static Employee[] arrayOfEmps = {
	    new Employee(1, "Jeff Bezos", 100000.0), 
	    new Employee(2, "Bill Gates", 200000.0), 
	    new Employee(3, "Mark Zuckerberg", 300000.0)
	};
	private static List<Employee> empList = null;
	
	@Before
	public void init() {
		empList = Arrays.asList(arrayOfEmps);
		empList.stream();
	}
	
	@Test
	public void whenSortStream_thenGetSortedStream() {
	    List<Employee> employees = empList.stream()
	      .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
	      .collect(Collectors.toList());

	    assertEquals(employees.get(0).getName(), "Bill Gates");
	    assertEquals(employees.get(1).getName(), "Jeff Bezos");
	    assertEquals(employees.get(2).getName(), "Mark Zuckerberg");
	}
	
	@Test
	public void whenFindMin_thenGetMinElementFromStream() {
	    Employee firstEmp = empList.stream()
	      .min((e1, e2) -> e1.getId() - e2.getId())
	      .orElseThrow(NoSuchElementException::new);

	    //assertEquals(firstEmp.getId(), new Integer(1));
	}
}
