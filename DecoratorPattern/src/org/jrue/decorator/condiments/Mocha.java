package org.jrue.decorator.condiments;

import org.jrue.decorator.beverages.Beverage;
import org.jrue.decorator.beverages.Condiments;

public class Mocha extends Condiments {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double getCost() {		
		return 30 + beverage.getCost();
	}

	@Override
	public String getDescription() {	
		return beverage.getDescription() + " with mocha";
	}
}
