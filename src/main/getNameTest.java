package main;

import main.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

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
