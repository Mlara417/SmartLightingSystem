package main;

public class GarageDoorDown implements Command {
	GarageDoor garageDoor;

	public GarageDoorDown(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}
}