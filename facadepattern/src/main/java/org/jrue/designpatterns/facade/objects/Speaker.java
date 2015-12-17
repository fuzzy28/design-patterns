package org.jrue.designpatterns.facade.objects;

public class Speaker implements Switchable {

	private int volume;
	
	public void turnOn() {
		System.out.println("Turning on Speaker");
	}
	
	public void turnOff() {
		System.out.println("Turning off Speaker");
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
		
}
