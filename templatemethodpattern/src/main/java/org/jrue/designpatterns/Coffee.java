package org.jrue.designpatterns;

public class Coffee extends HotBeverage {

	@Override
	void blendBeverage() {
		System.out.println("Blending Coffee...");
	}
	
	@Override
	public boolean hasCondiments() {
		return true;
	}
	
	@Override
	public void addCondiments() {
		System.out.println("Adding Whip Cream...");
	}

}
