package org.jrue.factory.factorymethod;

import org.jrue.factory.pizza.ManilaHamAndCheesePizza;
import org.jrue.factory.pizza.ManilaPepperoniPizza;
import org.jrue.factory.pizza.Pizza;
import org.jrue.factory.pizza.PizzaType;

public class ManilaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType type) {
		switch(type) {
		case HAMANDCHEESE:
			return new ManilaHamAndCheesePizza();
		case PEPPERONI:
			return new ManilaPepperoniPizza();
		default:
			return null;
		}		
	}

}
