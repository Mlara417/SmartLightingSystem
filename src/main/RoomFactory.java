package main;

public class RoomFactory {
	
	public Room createRoom(String type) {
		Room room = null;
		
		if(type.equals("Kitchen")) {
			room = new Kitchen();
		} else if (type.equals("Garage")) {
			room = new Garage();
		}
		return room;
	}
}