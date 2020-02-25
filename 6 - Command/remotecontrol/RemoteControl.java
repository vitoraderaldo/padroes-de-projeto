package remotecontrol;

public class RemoteControl {
	
	private static final int numberOfSlots = 7;
	
	Command[] onCommands;
	Command[] offCommands;	
	Command undoCommand;
	
	public RemoteControl() {
		this.onCommands = new Command[numberOfSlots];
		this.offCommands = new Command[numberOfSlots];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < numberOfSlots; i++) {
			this.onCommands[i] = noCommand;
			this.offCommands[i] = noCommand;
		}
		
		this.undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command on, Command off) {
		if(slotExists(slot)) {
			this.onCommands[slot] = on;
			this.offCommands[slot] = off;
		}
	}
	
	public void onButtonPush(int slot) {
		if(slotExists(slot)) {
			this.onCommands[slot].execute();
			this.undoCommand = this.onCommands[slot];
		}
	}
	
	public void offButtonPush(int slot) {
		if(slotExists(slot)) {
			this.offCommands[slot].execute();
			this.undoCommand = this.offCommands[slot];
		}
	}
	
	public void undoPush() {
		this.undoCommand.undo();
		this.undoCommand = new NoCommand();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n---- Remote Control ----\n");
		for(int i = 0; i < numberOfSlots; i++) {
			stringBuff.append("[slot " + i + "] " + this.onCommands[i].getClass().getName()
					+ " | " + this.offCommands[i].getClass().getName() + "\n");
		}		
		return stringBuff.toString();
	}
	
	private boolean slotExists(int slot) {
		return slot >= 0 && slot < numberOfSlots;
	}

}
