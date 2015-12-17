package org.jrue.designpatterns.facade.objects;

public class Airconditioner implements Switchable {

	public void turnOn() {
		System.out.println("Turning on AC");
	}

	public void turnOff() {
		System.out.println("Turning off AC");
	}

}
