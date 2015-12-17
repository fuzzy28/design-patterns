package org.jrue.factory.pizza;

public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	
	
	public void prepare() {
		System.out.println("Preparing pizza...");
	}
	
	public void bake() {
		System.out.println("Baking pizza...");
	}
	
	public void cook() {
		System.out.println("Cooking pizza at 350 degrees F...");
	}	
	
	public void slice() {
		System.out.println("Sliceing diagonally...");
	}
	
	public void box() {
		System.out.println("Boxing Pizza...");
	}
}
