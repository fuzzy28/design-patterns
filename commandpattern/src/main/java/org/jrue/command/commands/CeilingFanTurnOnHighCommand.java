package org.jrue.command.commands;

import org.jrue.command.objects.CeilingFan;
import org.jrue.command.objects.CeilingFan.Control;

public class CeilingFanTurnOnHighCommand implements Command {

	private CeilingFan ceilingFan;
	private Control prevControl;
	
	public CeilingFanTurnOnHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {		
		prevControl = ceilingFan.getControl();
		ceilingFan.turnOn(Control.HIGH);		
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
