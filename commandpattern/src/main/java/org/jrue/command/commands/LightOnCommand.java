package org.jrue.command.commands;

import org.jrue.command.objects.Light;

public class LightOnCommand implements Command {

	protected Light light;	
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOn();
	}
	
	@Override
	public void undo() {
		light.turnOff();
	}
}
