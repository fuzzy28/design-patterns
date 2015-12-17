import org.jrue.command.commands.CeilingFanTurnOffCommand;
import org.jrue.command.commands.CeilingFanTurnOnHighCommand;
import org.jrue.command.commands.CeilingFanTurnOnLowCommand;
import org.jrue.command.commands.CeilingFanTurnOnMediumCommand;
import org.jrue.command.commands.Command;
import org.jrue.command.commands.GarageDoorCloseCommand;
import org.jrue.command.commands.GarageDoorOpenCommand;
import org.jrue.command.commands.LightOffCommand;
import org.jrue.command.commands.LightOnCommand;
import org.jrue.command.invoker.RemoteControl;
import org.jrue.command.objects.CeilingFan;
import org.jrue.command.objects.GarageDoor;
import org.jrue.command.objects.Light;


public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl(7);
		
		CeilingFan ceilingFan = new CeilingFan();
		GarageDoor garageDoor = new GarageDoor();
		Light light = new Light();
		
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);
		Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		Command ceilingFanTurnOffCommand = new CeilingFanTurnOffCommand(ceilingFan);
		Command ceilingFanLowCommand = new CeilingFanTurnOnLowCommand(ceilingFan);
		Command ceilingFanMediumCommand = new CeilingFanTurnOnMediumCommand(ceilingFan);
		Command ceilingFanHighCommand = new CeilingFanTurnOnHighCommand(ceilingFan);
		
		remoteControl.addToSlot(0, lightOnCommand, lightOffCommand);
		remoteControl.addToSlot(1, garageDoorOpenCommand, garageDoorCloseCommand);
		remoteControl.addToSlot(2, ceilingFanLowCommand, ceilingFanTurnOffCommand);
		remoteControl.addToSlot(3, ceilingFanMediumCommand, ceilingFanTurnOffCommand);
		remoteControl.addToSlot(4, ceilingFanHighCommand, ceilingFanTurnOffCommand);
		System.out.println(remoteControl);	
	
		remoteControl.pressOnButton(3);
		remoteControl.pressOffButton(3);
		remoteControl.pressUndoButton();
		remoteControl.pressOnButton(4);
		remoteControl.pressUndoButton();
		remoteControl.pressUndoButton();
		remoteControl.pressUndoButton();
	}
}
