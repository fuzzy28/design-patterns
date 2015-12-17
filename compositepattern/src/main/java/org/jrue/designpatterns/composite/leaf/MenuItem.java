package org.jrue.designpatterns.composite.leaf;

import org.jrue.designpatterns.composite.component.MenuComponent;

public class MenuItem extends MenuComponent {

	
	public MenuItem(String name, String description) {
		super(name, description);
	}
	
	@Override
	public void print() {
		System.out.printf("-->%s,%s\n", getName(), getDescription());
	}
}
