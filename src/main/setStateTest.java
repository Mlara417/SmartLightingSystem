package main;

import static org.junit.jupiter.api.Assertions.*;
import main.*;


import org.junit.jupiter.api.Test;

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
