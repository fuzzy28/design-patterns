package org.jrue.ducks;

import org.jrue.duckbehavior.FlyNoFly;
import org.jrue.duckbehavior.QuackSilent;

public class RubberDucky extends Duck {

	public RubberDucky() {
		flyBehavior = new FlyNoFly();
		quackBehavior = new QuackSilent();
	}
	
	@Override
	public void display() {
		System.out.println("Rubber ducky...");
	}

	
}
