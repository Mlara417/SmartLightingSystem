package main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.Room;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
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
