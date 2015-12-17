package org.jrue.designpatterns.facade.objects;

public class Lights implements Switchable {

	private String location;
	
	public Lights(String location) {
		this.location = location;
	}
	
	public void turnOn() {
		System.out.println("Turning on the light");
	}

	public void turnOff() {
		System.out.println("Turning off the lights");
	}

	public String getLocation() {
		return location;
	}

}
