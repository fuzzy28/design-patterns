package org.jrue.designpatterns.iterator;

import java.util.Iterator;

import org.jrue.designpatterns.objects.BreakfastMenu;
import org.jrue.designpatterns.objects.LunchMenu;
import org.jrue.designpatterns.objects.Menu;

public class MenuTest {

	public static void main(String[] args) {
		Menu[] bfastMenus = {
				new Menu("Tapsilog", "Tapa-Sinangag-itlog", false),
				new Menu("Tosilog", "Tocino-Sinangag-itlog", false),
				new Menu("bangsilog", "Bangus-Sinangag-itlog", false),
				
		};
		
		BreakfastMenu bfast = new BreakfastMenu(bfastMenus);
		
		listOutMenu(bfast.iterator());
		
		LunchMenu lunch = new LunchMenu();
		lunch.addMenu(new Menu("Fried Chicken", "Deep Fried Chichen", false));
		lunch.addMenu(new Menu("LK", "Lechon Kawali with mang tomas", false));
		lunch.addMenu(new Menu("Pakbet", "Sauted Vegetables", true));
		
		listOutMenu(lunch.iterator());
	}
	
	//By providing a common interface which is Iterator,
	// we can traverse all menus regardless of actual implementation of its collection.
	static void listOutMenu(Iterator<Menu> it) {
		while(it.hasNext()) {	
			Menu menu = (Menu) it.next();
			System.out.println(menu.getMenu() + "==> " + menu.getDescription() + " " + menu.getPrice());
		}
	}
}
