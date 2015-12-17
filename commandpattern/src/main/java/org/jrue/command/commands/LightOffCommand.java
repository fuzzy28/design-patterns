package org.jrue.command.commands;

import org.jrue.command.objects.Light;

public class LightOffCommand implements Command {

	protected Light light;	
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOff();
	}

	@Override
	public void undo() {
		light.turnOn();
	}
	
}
