package org.jrue.ducks;

import org.jrue.duckbehavior.FlyWithRocket;
import org.jrue.duckbehavior.QuackSilent;

public class FlyingWoodenDuck extends Duck {

	public FlyingWoodenDuck() {
		flyBehavior = new FlyWithRocket();
		quackBehavior = new QuackSilent();
	}
	
	@Override
	public void display() {
		System.out.println("Flying wooden duck with rockey launcher");
	}

}
