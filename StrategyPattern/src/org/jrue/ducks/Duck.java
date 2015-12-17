package org.jrue.ducks;

import org.jrue.duckbehavior.FlyBehavior;
import org.jrue.duckbehavior.QuackBehavior;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void doFly() {
		flyBehavior.fly();
	}
	
	public void doQuack() {
		quackBehavior.quack();
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void display();	
	
}
