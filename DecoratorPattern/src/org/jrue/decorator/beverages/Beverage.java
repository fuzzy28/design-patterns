package org.jrue.decorator.beverages;

public abstract class Beverage {
	
	protected String description;
	
	public abstract double getCost();
	
	public String getDescription() {
		return description;
	}
	
	
}
