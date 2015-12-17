package org.jrue.command.commands;

public interface Command {
	void execute();
	void undo();
}
