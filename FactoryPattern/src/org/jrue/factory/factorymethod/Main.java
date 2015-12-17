package org.jrue.factory.factorymethod;
import org.jrue.factory.pizza.PizzaType;


public class Main {

	public static void main(String[] args) {
		PizzaStore store = new MakatiPizzaStore();
		store.orderPizza(PizzaType.PEPPERONI);
		store.orderPizza(PizzaType.HAMANDCHEESE);		
	}
}
