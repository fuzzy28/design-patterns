package org.jrue.ducks;

import org.jrue.duckbehavior.FlyNoFly;
import org.jrue.duckbehavior.QuackSilent;

public class WoodenDuck extends Duck{

	public WoodenDuck() {
		flyBehavior = new FlyNoFly();
		quackBehavior = new QuackSilent();
	}
	
	@Override
	public void display() {
		System.out.println("Just an ordinary wooden duck");
	}

}
