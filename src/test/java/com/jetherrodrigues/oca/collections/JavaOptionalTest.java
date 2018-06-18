package com.jetherrodrigues.oca.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;

/**
 * https://stackify.com/optional-java/
 * 
 * @author jether
 *
 */
public class JavaOptionalTest {
	
	@Test(expected = NoSuchElementException.class)
	public void whenCreateEmptyOptional_thenNull() {
		Optional<Employee> emptyOpt = Optional.empty();
		emptyOpt.get();
	}
	
	@Test(expected = NullPointerException.class)
	public void whenCreateOfEmptyOptional_thenNullPointerException() {
		Employee employee = null;
	    Optional<Employee> opt = Optional.of(employee);
	}
	
	@Test
	public void whenCreateOfNullableOptional_thenOk() {
	    String name = "John";
	    Optional<String> opt = Optional.ofNullable(name);	    
	    assertEquals("John", opt.get());
	}
	
	@Test
	public void whenCheckIfPresent_thenOk() {
		Employee employee = new Employee(1, "Jeff Bezos", 100000.0);
	    Optional<Employee> opt = Optional.ofNullable(employee);
	    assertTrue(opt.isPresent());
	    assertEquals("Jeff Bezos", opt.get().getName());
	}
	
}
