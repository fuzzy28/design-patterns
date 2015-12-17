package org.jrue.designpatterns.facade.objects;

public class DVDPlayer implements Switchable {

	private String movie;
	
	public DVDPlayer(String movie) {
		this.movie = movie;
	}
	
	
	public void turnOn() {
		System.out.println("Turning On DVD Player");
	}

	public void turnOff() {
		System.out.println("Turning Off DVD Player");
	}

	public void play() {
		System.out.println("Playing movie " + movie);
	}
}
