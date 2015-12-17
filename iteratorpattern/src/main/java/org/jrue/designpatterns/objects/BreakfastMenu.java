package org.jrue.designpatterns.objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BreakfastMenu implements Iterable<Menu> {

	private Menu[] menus;
	
	public BreakfastMenu(Menu[] menus) {
		this.menus = menus;
	}
	
	public Iterator<Menu> iterator() {
		return new ArrayList<Menu>(Arrays.asList(menus)).iterator();
	}

}
