package org.jrue.designpatterns.adapter;

import org.jrue.adapterpattern.objects.Duck;
import org.jrue.adapterpattern.objects.Turkey;

//converts duck into turkey to make it compatible with the turkey.
public class DuckAdapter implements Turkey {

	private Duck duck;
	
	public DuckAdapter(final Duck duck) {
		this.duck = duck;
	}
	
	public void gobble() {
		duck.quack();
	}

	public void fly() {
		duck.fly();
	}

}
