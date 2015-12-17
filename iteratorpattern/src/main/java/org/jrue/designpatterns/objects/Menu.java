package org.jrue.designpatterns.objects;

public class Menu {

	private String menu;
	private String description;
	private boolean isVegetable;
	private double price;
	
	public Menu(String menu, String description, boolean isVegetable) {
		this.menu = menu;
		this.description = description;
		this.isVegetable = isVegetable;
	}
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVegetable() {
		return isVegetable;
	}
	public void setVegetable(boolean isVegetable) {
		this.isVegetable = isVegetable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}	
}
