package org.jrue.command.commands;

import org.jrue.command.objects.CeilingFan;
import org.jrue.command.objects.CeilingFan.Control;

public class CeilingFanTurnOnLowCommand implements Command {

	private CeilingFan ceilingFan;
	private Control prevControl;
	
	public CeilingFanTurnOnLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {		
		prevControl = ceilingFan.getControl();
		ceilingFan.turnOn(Control.LOW);
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
