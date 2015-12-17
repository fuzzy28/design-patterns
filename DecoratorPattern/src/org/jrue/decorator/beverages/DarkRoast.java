package org.jrue.decorator.beverages;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double getCost() {	
		return 100;
	}

}
