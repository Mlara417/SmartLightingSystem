package main;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import main.*;

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
