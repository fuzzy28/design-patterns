package org.jrue.command.objects;

public class CeilingFan {
	
	private Control control;
	
	public CeilingFan() {
		control = Control.OFF;
	}
	
	public static enum Control {		
		OFF,
		LOW,
		MEDIUM,
		HIGH;		
	};
	
	public void turnOn(Control control) {
		this.control = control;
		System.out.printf("Fan is turn on to %s\n", this.control);
	}
	
	public void turnOff() {
		this.control = Control.OFF;
		System.out.println("Fan is turn off");
	}

	public Control getControl() {
		return control;
	}
	
}
