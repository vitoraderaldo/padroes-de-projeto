package remotecontrol;

public class CeilingFanHighCommand implements Command{
	
	private int previousSpeed;
	private CeilingFan ceilingFan;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		this.previousSpeed = this.ceilingFan.getSpeed();
		this.ceilingFan.high();
	}
	
	public void undo() {
		if (this.previousSpeed == CeilingFan.HIGH) this.ceilingFan.high();
		else if (this.previousSpeed == CeilingFan.MEDIUM) this.ceilingFan.medium();
		else if (this.previousSpeed == CeilingFan.LOW) this.ceilingFan.low();
		else if (this.previousSpeed == CeilingFan.OFF) this.ceilingFan.off();
	}
	

}
