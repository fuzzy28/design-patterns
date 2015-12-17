package org.jrue.factory.abstractfactoryUI;

public class UIFactory {

	static AbstractFactory getFactory(String os) {
		if(os.equals("windows")) {
			return new WindowsFactory();
		} else {
			return new MacOSFactory();
		}
	}
}
