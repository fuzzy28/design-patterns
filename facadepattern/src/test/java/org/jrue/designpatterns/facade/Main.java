package org.jrue.designpatterns.facade;

import org.jrue.designpatterns.facade.objects.Airconditioner;
import org.jrue.designpatterns.facade.objects.DVDPlayer;
import org.jrue.designpatterns.facade.objects.Lights;
import org.jrue.designpatterns.facade.objects.Speaker;
import org.jrue.designpatterns.facade.objects.Television;

public class Main {

	public static void main(String[] args) {
		
		Airconditioner ac = new Airconditioner();
		DVDPlayer dvdPlayer = new DVDPlayer("300");
		Lights lights = new Lights("Living Room");
		Speaker speaker = new Speaker();
		Television tv = new Television();
		TheaterFacade theater = new HomeTheaterFacade(ac, dvdPlayer, lights, speaker, tv);
		theater.watchMovie();
		
	}
}
