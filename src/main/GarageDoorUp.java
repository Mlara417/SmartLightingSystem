package main;

public class GarageDoorUp implements State {
	GarageDoor garageDoor;

	public GarageDoorUp(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void GarageDoorDown() {
		System.out.println("Invalid action");
	}

	@Override
	public void GarageDoorUp() {
		// TODO Auto-generated method stub
		garageDoor.setState(garageDoor.getUp());
		System.out.println(garageDoor.getState().toString());		
	}
	
	public String toString() {
		return "Garage door is up and landscape lights are on.";
	}
}