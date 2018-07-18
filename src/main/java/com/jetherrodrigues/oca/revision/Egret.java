package com.jetherrodrigues.oca.revision;

/**
 * Assessment test {12}
 * @author jether.rodrigues
 *
 */
public class Egret {
	private String color;
	public Egret() {
		this("white");
	}
	
	public Egret(String color) {
		// here occur the shadowing
		// the local variable color is assigned to color not the instance color variable
		color = color;
	}
	
	public static void main(String[] args) {
		Egret egret = new Egret();
		// here the default color instance variable is null
		System.out.println("Color: " + egret.color); 
	}

}
