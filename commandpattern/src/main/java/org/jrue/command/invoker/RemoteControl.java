package org.jrue.command.invoker;

import org.jrue.command.commands.Command;
import org.jrue.command.commands.NoCommand;

public class RemoteControl {

	private Command[] turnOnCommands;
	private Command[] turnOffCommands;
	private Command undoCommand;
	
	public RemoteControl(int slots) {
		turnOnCommands = new Command[slots];
		turnOffCommands = new Command[slots];
		
		Command command = new NoCommand();
		
		for (int i = 0; i < slots; i++) {
			turnOnCommands[i] = command;
			turnOffCommands[i] = command;
		}		
		undoCommand = command;
	}
	
	public void addToSlot(int slotNo, Command turnOnCommand, Command turnOffCommand) {
		turnOnCommands[slotNo] = turnOnCommand;
		turnOffCommands[slotNo] = turnOffCommand;
	}
	
	public void pressOnButton(int slotNo) {
		turnOnCommands[slotNo].execute();
		undoCommand = turnOnCommands[slotNo];
	}
	
	public void pressOffButton(int slotNo) {
		turnOffCommands[slotNo].execute();
		undoCommand = turnOffCommands[slotNo];
	}
	
	public void pressUndoButton() {
		undoCommand.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n-----------Remote Control-----------\n");
		for (int i = 0; i < turnOnCommands.length; i++) {
			buffer.append("[slot " + i + "] " + turnOnCommands[i].getClass().getSimpleName() + "\t" + 
					turnOffCommands[i].getClass().getSimpleName() + "\n");
		}
		buffer.append("\n----------- " + undoCommand.getClass().getSimpleName() + " -----------\n");
		return buffer.toString();
	}
}
