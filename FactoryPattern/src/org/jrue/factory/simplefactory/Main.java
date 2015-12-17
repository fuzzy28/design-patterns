package org.jrue.factory.simplefactory;
import org.jrue.factory.pizza.PizzaType;


public class Main {

	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();
		store.orderPizza(PizzaType.PEPPERONI);
		store.orderPizza(PizzaType.HAMANDCHEESE);		
	}
}
