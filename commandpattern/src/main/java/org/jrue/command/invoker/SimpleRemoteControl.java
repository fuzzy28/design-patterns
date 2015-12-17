package org.jrue.command.invoker;

import org.jrue.command.commands.Command;

public class SimpleRemoteControl {
	protected Command command;
	
	public SimpleRemoteControl(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed() {
		command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
}
