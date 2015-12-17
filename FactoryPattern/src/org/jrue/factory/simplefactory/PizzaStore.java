package org.jrue.factory.simplefactory;

import org.jrue.factory.pizza.Pizza;
import org.jrue.factory.pizza.PizzaType;

public class PizzaStore {
	
	public void orderPizza(PizzaType type) {
		Pizza pizza = new PizzaFactory().createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cook();
		pizza.slice();
		pizza.box();
	}
}
