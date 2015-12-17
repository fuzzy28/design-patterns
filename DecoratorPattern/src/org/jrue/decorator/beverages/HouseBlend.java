package org.jrue.decorator.beverages;

public class HouseBlend extends Beverage  {

	public HouseBlend() {
		description = "House Blend";
	}
	
	@Override
	public double getCost() {		
		return 50;
	}
}
