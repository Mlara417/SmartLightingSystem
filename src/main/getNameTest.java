package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.Room;

import org.junit.jupiter.api.Test;

public class getNameTest {
	Room garage = new Garage();
	Room kitchen = new Kitchen();
	@Test
	public void getNametest() {
		String expected = "Garage";
		String result = garage.getName();
		assertEquals(expected, result);
		
	}

}
