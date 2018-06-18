package com.jetherrodrigues.oca.collections;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7302180248206408381L;
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {	
	}

	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
	}

	public double salaryIncrement(double increment) {
		return this.getSalary() + increment;
	}
	
}
