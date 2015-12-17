package org.jrue.factory.abstractfactoryUI;

public class WindowsFactory implements AbstractFactory {

	@Override
	public AbstractForm createForm() {
		return new WindowsForm();
	}

	@Override
	public AbstractButton createButton() {
		return new WindowsButton();
	}

	@Override
	public AbstractTextField createTextField() {
		return new WindowsTextField();
	}


}
