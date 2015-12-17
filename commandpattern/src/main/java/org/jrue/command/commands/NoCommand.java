package org.jrue.command.commands;

/**
 * A class that do nothing.
 * Null Object Design Pattern implementation
 * @author jruelos
 *
 */
public class NoCommand implements Command{

	@Override
	public void execute() {}
	
	@Override
	public void undo() {}

}
