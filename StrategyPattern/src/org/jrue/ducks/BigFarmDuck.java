package org.jrue.ducks;

import org.jrue.duckbehavior.FlyNoFly;
import org.jrue.duckbehavior.QuackOutLoud;

public class BigFarmDuck extends Duck {

	public BigFarmDuck() {
		flyBehavior = new FlyNoFly();
		quackBehavior = new QuackOutLoud();
	}
	
	@Override
	public void display() {
		System.out.println("Big flying farm duck");
	}

}
