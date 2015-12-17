package org.jrue.factory.abstractfactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryMaker.getFactory("a");
		AbstractProductA product = factory.createProductA();
		product.doMethod1();
	}
	
}
