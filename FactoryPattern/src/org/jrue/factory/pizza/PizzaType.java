package org.jrue.factory.pizza;

public enum PizzaType {

	HAMANDCHEESE("cheese"),
	PEPPERONI("pepperoni");
	
	private String pizzaType;	
	
	private PizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	
	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	
	
}
