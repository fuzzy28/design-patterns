package org.jrue.duckbehavior;

public class QuackNoQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't quack");
	}

}
