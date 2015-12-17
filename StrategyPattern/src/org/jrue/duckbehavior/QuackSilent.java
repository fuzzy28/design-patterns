package org.jrue.duckbehavior;

public class QuackSilent implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quacking silent...");
	}

}
