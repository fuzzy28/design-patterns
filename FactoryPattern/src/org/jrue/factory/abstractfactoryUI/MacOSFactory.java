package org.jrue.factory.abstractfactoryUI;

public class MacOSFactory implements AbstractFactory {

	@Override
	public AbstractForm createForm() {
		return new MacOSForm();
	}

	@Override
	public AbstractButton createButton() {
		return new MacOSButton();
	}

	@Override
	public AbstractTextField createTextField() {
		return new MacOSTextField();
	}


}
