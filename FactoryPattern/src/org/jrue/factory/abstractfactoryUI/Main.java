package org.jrue.factory.abstractfactoryUI;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = UIFactory.getFactory("mac");
		AbstractForm windowsUI = factory.createForm();
		windowsUI.drawForm();
	}
}
