package org.jrue.designpatterns.composite.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jrue.designpatterns.composite.component.MenuComponent;

public class Menu extends MenuComponent {
	
	private List<MenuComponent> menus;
	
	public Menu(String name, String description) {
		super(name, description);
		menus = new ArrayList<MenuComponent>();
	}
	
	@Override
	public void addMenu(MenuComponent menu) {
		menus.add(menu);
	}
	
	@Override
	public void removeMenu(MenuComponent menu) {
		menus.remove(menu);
	}
	
	@Override
	public void print() {
		System.out.printf("%s %s\n", getName(), getDescription());
		Iterator<MenuComponent> it = menus.iterator();
		while(it.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) it.next();
			menuComponent.print();
		}
	}
}
