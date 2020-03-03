package main;

abstract public class Room {
	String name;
	int lightCount;
	
	public String getName() {
		return name;
	}
	
	public int getLightCount() {
		return lightCount;
	}
	
	public void addLights(int lightCount) {
		System.out.println("You have added " + lightCount + " lights to the " + name + "." );
		this.lightCount = lightCount;
	}
	
	public String toString() {
		//code to display the room name and light quantity
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(lightCount + " lights\n");
		
		return display.toString();
	}

}
