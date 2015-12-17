package org.jrue.designpatterns.composite.component;

public abstract class MenuComponent {
	
	private String name;
	private String description;
	
	public MenuComponent(String name, String description) {
		this.name = name;
		this.description = description;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void addMenu(MenuComponent menu) {
		throw new UnsupportedOperationException();
	}
	
	public void removeMenu(MenuComponent menu) {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
}
