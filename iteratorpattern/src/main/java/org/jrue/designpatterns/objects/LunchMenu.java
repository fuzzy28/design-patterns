package org.jrue.designpatterns.objects;

import java.util.ArrayList;
import java.util.Iterator;

public class LunchMenu implements Iterable<Menu> {

	private ArrayList<Menu> menus;
	
	public LunchMenu() {
		menus = new ArrayList<Menu>();
	}
	
	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public Iterator<Menu> iterator() {
		return menus.iterator();
	}
}
