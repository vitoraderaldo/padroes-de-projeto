package remotecontrol;

public class GarageDoorOpenCommand implements Command{
	
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor g) {
		this.garageDoor = g;
	}
	
	public void execute() {		
		this.garageDoor.up();
	}
	
	public void undo() {		
		this.garageDoor.down();
	}
	

}
