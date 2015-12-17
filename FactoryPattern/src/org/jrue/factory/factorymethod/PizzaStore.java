package org.jrue.factory.factorymethod;

import org.jrue.factory.pizza.Pizza;
import org.jrue.factory.pizza.PizzaType;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(PizzaType type);
	
	public void orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cook();
		pizza.slice();
		pizza.box();
	}
}
