package org.jrue.command.commands;

import org.jrue.command.objects.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.doorOpen();
	}
	
	@Override
	public void undo() {
		garageDoor.doorClose();
	}
}
