package org.jrue.factory.abstractfactory;

public class FactoryMaker {

	static AbstractFactory getFactory(String option) {
		
		if(option.equals("a")) {
			return new ConcreteFactory1();
		} else {
			return new ConcreteFactory2();
		}
	}
}
