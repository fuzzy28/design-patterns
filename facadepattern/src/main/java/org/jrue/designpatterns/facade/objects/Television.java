package org.jrue.designpatterns.facade.objects;

public class Television implements Switchable {

	public void turnOn() {
		System.out.println("Turning on TV");
	}
	
	public void turnOff() {
		System.out.println("Turning off Tv");
	}
}
