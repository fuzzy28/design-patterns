package org.jrue.designpatterns.facade;

import org.jrue.designpatterns.facade.objects.Airconditioner;
import org.jrue.designpatterns.facade.objects.DVDPlayer;
import org.jrue.designpatterns.facade.objects.Lights;
import org.jrue.designpatterns.facade.objects.Speaker;
import org.jrue.designpatterns.facade.objects.Television;

public class HomeTheaterFacade implements TheaterFacade {

	Airconditioner airConditioner;
	DVDPlayer dvdPlayer;
	Lights lights;
	Speaker speaker;
	Television television;
	
	
	public HomeTheaterFacade(Airconditioner airconditioner,
						DVDPlayer dvdPlayer,
						Lights lights,
						Speaker speaker,
						Television television) {
		this.airConditioner = airconditioner;
		this.dvdPlayer = dvdPlayer;
		this.lights = lights;
		this.speaker = speaker;
		this.television = television;
	}

	public void stopMovie() {
		// TODO Auto-generated method stub
		
	}

	public void watchMovie() {
		airConditioner.turnOn();
		television.turnOn();
		dvdPlayer.turnOn();
		speaker.turnOn();
		dvdPlayer.play();				
		speaker.setVolume(20);
		lights.turnOff();
	}

}
