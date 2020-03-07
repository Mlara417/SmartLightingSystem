package main;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import main.*;

@RunWith(JUnitPlatform.class)
public class createRoomTest{
	RoomFactory factory = new RoomFactory();
	Home home = new Home(factory);
	Room garage;


	@Test
	public void createRoomTest() {
		Room room = home.createRoom("Kitchen", 1);
		String result = room.getName();
		Room kitchen = new Kitchen();
		String expected = kitchen.name;
		
		assertEquals(expected, result);
		
	}

}