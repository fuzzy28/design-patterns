package org.jrue.factory.simplefactory;

import org.jrue.factory.pizza.HamAndCheesePizza;
import org.jrue.factory.pizza.PepperoniPizza;
import org.jrue.factory.pizza.Pizza;
import org.jrue.factory.pizza.PizzaType;

public class PizzaFactory {

	public Pizza createPizza(PizzaType type) {		
		switch(type) {
		case HAMANDCHEESE:
			return new HamAndCheesePizza();
		case PEPPERONI:
			return new PepperoniPizza();
		default:
			return null;
		}		
	}
}
