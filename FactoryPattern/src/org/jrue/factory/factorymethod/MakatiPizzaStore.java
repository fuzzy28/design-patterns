package org.jrue.factory.factorymethod;

import org.jrue.factory.pizza.MakatiHamAndCheesePizza;
import org.jrue.factory.pizza.MakatiPepperoniPizza;
import org.jrue.factory.pizza.Pizza;
import org.jrue.factory.pizza.PizzaType;

public class MakatiPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType type) {
		switch(type) {
		case HAMANDCHEESE:
			return new MakatiHamAndCheesePizza();
		case PEPPERONI:
			return new MakatiPepperoniPizza();
		default:
			return null;
		}	
	}

}
