package remotecontrol;

public interface Command{
	public void execute();
	public void undo();
}