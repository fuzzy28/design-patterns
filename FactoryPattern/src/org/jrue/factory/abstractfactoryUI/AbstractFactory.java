package org.jrue.factory.abstractfactoryUI;

public interface AbstractFactory {

	AbstractForm createForm();
	AbstractButton createButton();
	AbstractTextField createTextField();
}
