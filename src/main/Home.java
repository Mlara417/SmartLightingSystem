package main;

public class Home {
	
	RoomFactory factory;
	
	public Home(RoomFactory factory) {
		this.factory = factory;
	}
	
	public Room createRoom(String type, int amount) {
		Room room;
		
		room = factory.createRoom(type);
		
		room.addLights(amount);
		
		return room;
	}

}
