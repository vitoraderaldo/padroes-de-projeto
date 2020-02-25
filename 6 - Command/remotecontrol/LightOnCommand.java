package remotecontrol;

public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light l) {
		this.light = l;
	}

	public void execute() {	
		this.light.on();
	}
	
	public void undo() {		
		this.light.off();
	}

}
