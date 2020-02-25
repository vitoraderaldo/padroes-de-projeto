package remotecontrol;

public class SimpleRemoteTest{
	
	public static void main(String args[]) {		
				
		SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
		Command lightsOn = new LightOnCommand(new Light());
		simpleRemote.setCommand(lightsOn);
		simpleRemote.buttonWasPressed();		
		
		Command garage = new GarageDoorOpenCommand(new GarageDoor());
		simpleRemote.setCommand(garage);
		simpleRemote.buttonWasPressed();		
	}	

}