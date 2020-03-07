package main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class nextTest {

	@Test
	public void nexttest1() {
		Iterator result;
		String expected = "red";
		ColorRepository colorrepo = new ColorRepository();
		result = colorrepo.getIterator();
		assertEquals(expected, result.next());
		
	}

}