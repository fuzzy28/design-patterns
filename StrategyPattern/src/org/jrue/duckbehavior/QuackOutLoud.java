package org.jrue.duckbehavior;

public class QuackOutLoud implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking out loud");
	}

}
