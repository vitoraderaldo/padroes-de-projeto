package remotecontrol;

public class LightOffCommand implements Command {
	
	private Light light;
	
	public LightOffCommand(Light l) {
		this.light = l;
	}
	
	public void execute() {
		this.light.off();		
	}
	
	public void undo() {
		this.light.on();			
	}

}
