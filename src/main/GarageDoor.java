package main;

public class GarageDoor {
	String location;
	State state;
	
	State up;
	State down;

	public GarageDoor() {
		up = new GarageDoorUp(this);
		down = new GarageDoorDown(this);
		
		state = down;
	}

	//initializing
	public void setUp() {
		state.GarageDoorUp();
	}

	public void setDown() {
		state.GarageDoorDown();
	}

	void setState(State state) {
		this.state = state;
	}
	
	//return state values
	public State getState() {
		return state;
	}
	public State getUp() {
		return up;
	}
	public State getDown() {
		return down;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(state + "\n");
		return result.toString();
	}
	
}
