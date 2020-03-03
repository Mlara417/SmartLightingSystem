package main;

public class GarageDoorDown implements State {
	
	GarageDoor garageDoor;

	public GarageDoorDown(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void GarageDoorDown() {
		garageDoor.setState(garageDoor.getDown());
				
	}

	@Override
	public void GarageDoorUp() {
		System.out.println("Invalid action");
	}
	
	public String toString() {
		return "Garage Door is down and landscape lights are off";
	}
}