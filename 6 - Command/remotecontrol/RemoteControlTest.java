package remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl control = new RemoteControl();	
		
		Light light = new Light();
		control.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
		
		GarageDoor garageDoor = new GarageDoor();
		control.setCommand(1, new GarageDoorOpenCommand(garageDoor), new GarageDoorCloseCommand(garageDoor) );
		
		CeilingFan ceilingFanKitchen = new CeilingFan("Kitchen");
		control.setCommand(2, new CeilingFanMediumCommand(ceilingFanKitchen), new CeilingFanOffCommand(ceilingFanKitchen));
		control.setCommand(3, new CeilingFanHighCommand(ceilingFanKitchen), new CeilingFanOffCommand(ceilingFanKitchen));		
		
		control.onButtonPush(0);
		control.undoPush();
		control.undoPush();
		control.onButtonPush(1);		
		control.onButtonPush(2);
		control.onButtonPush(3);
		control.undoPush();		
		
		control.offButtonPush(0);
		control.offButtonPush(1);
		control.offButtonPush(2);	
		
		
		System.out.println(control.toString());
	}

}
