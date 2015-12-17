package org.jrue.command.commands;

import org.jrue.command.objects.CeilingFan;
import org.jrue.command.objects.CeilingFan.Control;

public class CeilingFanTurnOffCommand implements Command {

	private CeilingFan ceilingFan;
	private Control prevControl;
	
	public CeilingFanTurnOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		prevControl = ceilingFan.getControl();
		ceilingFan.turnOff();
		
	}

	@Override
	public void undo() {
		if(prevControl == Control.OFF) {
			ceilingFan.turnOff();
		} else {
			ceilingFan.turnOn(prevControl);
		}
	}
	
}
