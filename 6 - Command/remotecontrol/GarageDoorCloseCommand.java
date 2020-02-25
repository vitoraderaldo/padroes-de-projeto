package remotecontrol;

public class GarageDoorCloseCommand implements Command {
	
	private GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor g) {
		this.garageDoor = g;
	}
	
	public void execute() {
		this.garageDoor.down();
	}
	
	public void undo() {		
		this.garageDoor.up();
	}
}
