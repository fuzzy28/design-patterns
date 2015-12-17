import org.junit.Test;
import org.jrue.command.commands.GarageDoorOpenCommand;
import org.jrue.command.commands.LightOnCommand;
import org.jrue.command.invoker.SimpleRemoteControl;
import org.jrue.command.objects.GarageDoor;
import org.jrue.command.objects.Light;

public class SimpleRemoteControlTest {
		
	@Test
	public void turnOnTheLightsNow() {		
		
		//receiver
		Light light = new Light();
		
		//command
		LightOnCommand lightOn = new LightOnCommand(light);
		
		//invoker
		SimpleRemoteControl remoteControl = new SimpleRemoteControl(lightOn);
		
		remoteControl.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);		
		remoteControl.setCommand(garageDoorOpen);
		remoteControl.buttonWasPressed();
	}
}
