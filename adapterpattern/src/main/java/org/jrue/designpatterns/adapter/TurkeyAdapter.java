package org.jrue.designpatterns.adapter;

import org.jrue.adapterpattern.objects.Duck;
import org.jrue.adapterpattern.objects.Turkey;

// converts turkey into duck to make it compatible with the duck.
public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
	
}
