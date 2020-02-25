package remotecontrol;

public class SimpleRemoteControl {
	
	private Command slot;
	
	public SimpleRemoteControl() {		
	}
	
	public void setCommand(Command c) {
		this.slot = c;
	}
	
	public void buttonWasPressed() {
		this.slot.execute();
	}

}
