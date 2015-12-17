package org.jrue.decorator.beverages;

public class Espresso extends Beverage{

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double getCost() {		
		return 30;
	}
}
