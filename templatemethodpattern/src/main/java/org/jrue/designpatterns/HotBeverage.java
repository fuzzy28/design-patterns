package org.jrue.designpatterns;

public abstract class HotBeverage {
	
	
	/** remember, template method pattern should be final
		so child classes will not be able to override this method. */
	public final void prepare() {
		boilWater();
		blendBeverage();
		pourIntoCup();
		if(hasCondiments()) {
			addCondiments();
		}
	}
	
	public void boilWater() {
		System.out.println("Boiling water...");
	}
	
	public void pourIntoCup() {
		System.out.println("Pouring cup into beverage...");
	}
	
	abstract void blendBeverage();
	
	// method hook, allows child classes to change the
	// default behavior by overriding this method and 
	// providing a specific implementation.
	public boolean hasCondiments() {
		return false;
	}
	
	
	public void addCondiments() {}

}
