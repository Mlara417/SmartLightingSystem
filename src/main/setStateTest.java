package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import main.*;
import org.junit.jupiter.api.Test;

@RunWith(JUnitPlatform.class)
public class setStateTest {
	GarageDoor garagedoor = new GarageDoor();
	String result;
	String expected = garagedoor.getUp().toString();

	@Test
	public void test() {
		garagedoor.setState(garagedoor.up);
		result = garagedoor.toString();
		assertEquals(expected, result); 
	}

}
